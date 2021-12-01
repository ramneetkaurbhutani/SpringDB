package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SpringDbApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDbApplication.class, args);
		
		
	}

}
