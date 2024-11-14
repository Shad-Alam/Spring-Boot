package com.shad.Getting_Started_with_MongoDB;

import org.springframework.boot.SpringApplication;

public class TestGettingStartedWithMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.from(GettingStartedWithMongoDbApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
