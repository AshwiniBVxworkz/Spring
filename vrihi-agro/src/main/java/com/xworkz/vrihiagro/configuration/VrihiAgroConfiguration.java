package com.xworkz.vrihiagro.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz")
public class VrihiAgroConfiguration {
	public VrihiAgroConfiguration() {
		System.out.println("Inside VrihiAgroConfiguration ");
	}

}
