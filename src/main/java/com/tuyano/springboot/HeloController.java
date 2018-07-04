package com.tuyano.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestController;


@RestController
public class HeloController {
	
	@RequestMapping("/")
	public String index(){
		return "Hello Spring-Boot World";
	}
}
