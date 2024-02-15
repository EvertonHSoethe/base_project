package com.base.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProjectApplication::main).with(TestProjectApplication.class).run(args);
	}

}
