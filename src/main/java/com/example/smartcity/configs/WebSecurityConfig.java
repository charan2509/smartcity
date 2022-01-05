package com.example.smartcity.configs;

import com.example.smartcity.services.CustomUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    CustomizeAuthenticationSuccessHandler  customizeAuthenticationSuccessHandler;

    @Bean
    public UserDetailsService mongoUserDetails() {
        return new CustomUserDetailsService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserDetailsService userDetailsService = mongoUserDetails();
        auth
            .userDetailsService(userDetailsService)
            .passwordEncoder(bCryptPasswordEncoder);
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            
            .authorizeRequests()
            .antMatchers("/").permitAll()
            .antMatchers("/", "/home", "/js/**", "/css/**").permitAll()
            .antMatchers("/login").permitAll()
            .antMatchers("/signup").permitAll()
            .antMatchers("/jobs").permitAll()
            .antMatchers("/home").permitAll()
            .antMatchers("/unis").permitAll()
            .antMatchers("/tours").permitAll()
            .antMatchers("/contacts").permitAll()
            .antMatchers("/hospitals").permitAll()
            .antMatchers("/addjobs").hasAuthority("ADMIN")
            .antMatchers("/addtours").hasAuthority("ADMIN")
            .antMatchers("/addentertainments").hasAuthority("ADMIN")
            .antMatchers("/hotels").permitAll()
            .antMatchers("/entertainments").permitAll()
            .antMatchers("/addhotels").hasAuthority("ADMIN")
            .antMatchers("/addhospitals").hasAuthority("ADMIN")
            .antMatchers("/addunis").hasAuthority("ADMIN")
            .antMatchers("/dashboard/**").hasAuthority("ADMIN").anyRequest()
            .authenticated().and().csrf().disable().formLogin().successHandler(customizeAuthenticationSuccessHandler)
            .loginPage("/login").failureUrl("/login?error=true")
            .usernameParameter("email")
            .passwordParameter("password")
            .and().logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .logoutSuccessUrl("/").and().exceptionHandling();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
            .ignoring()
            .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
    }
}
