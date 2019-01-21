package com.avendra.purs.ExtractData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ExtractDataApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ExtractDataApplication.class, args);
		for (String s : context.getBeanDefinitionNames()) {
			System.out.println(s);

		}
	}}


