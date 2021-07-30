package com.ebit.hrmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(value = "com.ebit.hrmanagement.*")
public class HRManagementApp {

	public static void main(String[] arg) {
		SpringApplication.run(HRManagementApp.class, arg);
	}
}
