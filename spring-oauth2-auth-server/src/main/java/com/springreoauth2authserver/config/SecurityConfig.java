package com.springreoauth2authserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    UserDetailsService inMemoryUserDetailsService(){
        var userBuilder = User.builder();
        UserDetails deep =  userBuilder
                .username("deep")
                .password("{noop}password")
                .roles("USER","ADMIN")
                .build();
        return new InMemoryUserDetailsManager(deep);
    }
}
