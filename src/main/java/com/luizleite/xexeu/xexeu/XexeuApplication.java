package com.luizleite.xexeu.xexeu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class XexeuApplication {

	public static void main(String[] args) {
		SpringApplication.run(XexeuApplication.class, args);
	}

}

