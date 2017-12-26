package com.example.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.example.ctrl")
@SpringBootApplication
public class OnlineBankingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBankingSystemApplication.class, args);
	}
}
