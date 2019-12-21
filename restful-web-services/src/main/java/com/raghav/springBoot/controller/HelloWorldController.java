package com.raghav.springBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghav.springBoot.model.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Hello-World SpringBoot 2.2.2 and docker 19.03.2";
	}
	
	@GetMapping(path = "/hello-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
}
