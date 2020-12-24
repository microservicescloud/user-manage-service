package com.cs.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class UserManageServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(UserManageServiceApp.class, args);
    }

}