package com.myorg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile(value = {"prod","qa","dev"})
public class ProfilesWithPropertiesFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfilesWithPropertiesFileApplication.class, args);
	}

}
