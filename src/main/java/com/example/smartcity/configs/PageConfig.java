package com.example.smartcity.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PageConfig implements WebMvcConfigurer {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/dashboard").setViewName("dashboard");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/jobs").setViewName("jobs");
        registry.addViewController("/tours").setViewName("tours");
        registry.addViewController("/unis").setViewName("unis");
        registry.addViewController("/hotels").setViewName("hotels");
        registry.addViewController("/hospitals").setViewName("hospitals");
        registry.addViewController("/contacts").setViewName("contacts");
        registry.addViewController("/entertainments").setViewName("entertainments");
        registry.addViewController("/allcontacts").setViewName("allcontacts");
    }
}
