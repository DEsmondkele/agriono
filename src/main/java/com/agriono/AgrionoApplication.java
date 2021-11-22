package com.agriono;

import com.agriono.services.SessionFactoryUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AgrionoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgrionoApplication.class,args);}
    @Bean
    public SessionFactoryUtil sessionFactoryUtil(){
        return  new SessionFactoryUtil();
    }
        @Bean
        public BCryptPasswordEncoder bCryptPasswordEncoder(){

        return new BCryptPasswordEncoder();
        }

}
