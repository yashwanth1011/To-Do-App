package com.example.springProject.ToDoApp.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


import java.util.function.Function;

import static org.springframework.security.config.Customizer.withDefaults;
@EnableWebSecurity
@Configuration
public class UserAuthentication {
    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager(){
        UserDetails user1 = users("Yashwanth", "abcd");
        UserDetails user2 = users("Chennu", "abcd");


        return new InMemoryUserDetailsManager(user1, user2);


    }
    private UserDetails users(String name, String password){
        Function<String, String> passEncoderLambda = input -> passwordEncoder().encode(input);

        UserDetails user = User.builder().passwordEncoder(passEncoderLambda).username(name).password(password)
                .roles("USER", "ADMIN").build();
        return user;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();

    }





    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().authenticated()
                )
                .formLogin(withDefaults())
                .csrf(csrf -> csrf.disable())  // Disable CSRF protection
                .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()));  // Disable frame options for H2 console

        return http.build();
    }




}
