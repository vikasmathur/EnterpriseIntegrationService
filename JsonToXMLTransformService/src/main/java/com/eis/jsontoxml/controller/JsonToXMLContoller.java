package com.eis.jsontoxml.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonToXMLContoller {
	@RequestMapping("/")
	String home() {
		System.out.println(".....................In Controller Class.....................");
		return "Hello World!";
	}

}
