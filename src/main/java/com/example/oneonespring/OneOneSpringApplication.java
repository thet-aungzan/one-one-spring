package com.example.oneonespring;

import com.example.oneonespring.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneOneSpringApplication implements CommandLineRunner {

    @Autowired
    private InformationService informationService;

    public static void main(String[] args) {
        SpringApplication.run(OneOneSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        informationService.creatDb();

        informationService.findCustomerByAddressId(2);

        System.out.println("Address Name :"+informationService.findAddressByCustomerId(1));
    }
}
