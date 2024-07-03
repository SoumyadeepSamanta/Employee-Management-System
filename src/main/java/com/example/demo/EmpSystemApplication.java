package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages= {com.example.demo.controller})
public class EmpSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpSystemApplication.class, args);
	}

}
