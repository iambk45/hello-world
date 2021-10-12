package com.jenkins.demo.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public ResponseEntity<Object> getMessage(){
		return new ResponseEntity<Object>("Hello World", HttpStatus.OK);
	}
}