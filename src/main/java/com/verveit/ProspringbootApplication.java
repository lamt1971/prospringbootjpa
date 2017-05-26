package com.verveit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.verveit.springdata.dao" })
public class ProspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProspringbootApplication.class, args);
	}
}
