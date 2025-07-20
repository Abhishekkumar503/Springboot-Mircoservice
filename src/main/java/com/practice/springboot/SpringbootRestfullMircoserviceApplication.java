package com.practice.springboot;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestfullMircoserviceApplication {


	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootRestfullMircoserviceApplication.class, args);
	}

}
