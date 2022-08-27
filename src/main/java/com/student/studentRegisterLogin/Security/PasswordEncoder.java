package com.student.studentRegisterLogin.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class PasswordEncoder  {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {// returns the password encoder bean
        return new BCryptPasswordEncoder();
    }
    
}
