package com.rs.fer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//it will handle manythings @Resource,@ComponentScan,@EnableAutoConfiguration,@Configuration

@SpringBootApplication
@EnableTransactionManagement
public class Application 
{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
