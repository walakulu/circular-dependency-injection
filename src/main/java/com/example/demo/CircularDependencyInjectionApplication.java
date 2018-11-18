package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bean.BeanA;

@SpringBootApplication
public class CircularDependencyInjectionApplication {
	
	@Autowired
	private BeanA beanA;

	public static void main(String[] args) {
		SpringApplication.run(CircularDependencyInjectionApplication.class, args);
	}
}
