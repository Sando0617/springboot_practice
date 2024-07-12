package org.mysite.sbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hellocontroller {
	
	@GetMapping("/")
	public String hello() {
		return "hello_controller";
	}
}
