package com.tnsif.springRestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	
	@RequestMapping("/hello")
	public String show() {
		return "Welcome";
	}
	@GetMapping("/hello")
	public String greeting(@RequestParam String name) {
		return "HI"+name;
		
	}
	@GetMapping("/heloo/{name}")
	public String message(@PathVariable String name) {
		return "welcome"+name;
	}
}
