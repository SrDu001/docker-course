package com.example.testdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories({ "com.example..dao" })
@EntityScan({ "com.example.entity" })
public class TestdockerApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(TestdockerApplication.class, args);
	}

}
