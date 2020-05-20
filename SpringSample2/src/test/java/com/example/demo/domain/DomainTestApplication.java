package com.example.demo.domain;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DomainTestApplication {
    public static void main(String[] args) {
        // ドメイン層のみのテストを行いたい場合、このように分ける
        SpringApplication.run(DomainTestApplication.class, args);
    }

}
