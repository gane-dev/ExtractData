package com.avendra.purs.ExtractData;

import com.avendra.purs.ExtractData.entity.Car;
import com.avendra.purs.ExtractData.entity.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExtractDataApplication {
    @Autowired
    private CarRepository repository;
	private static final Logger logger = LoggerFactory.getLogger(ExtractDataApplication.class);
	public static void main(String[] args) {

//		ConfigurableApplicationContext context = SpringApplication.run(ExtractDataApplication.class, args);
//		for (String s : context.getBeanDefinitionNames()) {
//			System.out.println(s);
//
//		}
		SpringApplication.run(ExtractDataApplication.class, args);
		logger.info("Hello Spring Boot");
	}
    @Bean
    CommandLineRunner runner(){
        return args -> {
            // Place your code here
            // Save demo data to database
            repository.save(new Car("Ford", "Mustang", "Red",
                    "ADF-1121", 2017, 59000));
            repository.save(new Car("Nissan", "Leaf", "White",
                    "SSJ-3002", 2014, 29000));
            repository.save(new Car("Toyota", "Prius", "Silver",
                    "KKO-0212", 2018, 39000));
        };
    }
}


