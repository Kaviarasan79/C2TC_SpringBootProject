package com.tnsif.qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootqualifierApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext var=SpringApplication.run(SpringbootqualifierApplication.class, args);
		Customer c1=var.getBean(Customer.class);
		c1.order();
		
		System.out.println("Hello");
	}

}
