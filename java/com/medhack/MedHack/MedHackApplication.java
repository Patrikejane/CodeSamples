package com.medhack.MedHack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.medhack.MedHack.*"})
@ComponentScan(basePackages = "com.medhack.MedHack")
public class MedHackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedHackApplication.class, args);
	}
}
