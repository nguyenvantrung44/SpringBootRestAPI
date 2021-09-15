package com._nguyenvantrung_17071691;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com._nguyenvantrung_17071691")
@EntityScan("com._nguyenvantrung_17071691.entity")
@EnableJpaRepositories("com._nguyenvantrung_17071691.repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
