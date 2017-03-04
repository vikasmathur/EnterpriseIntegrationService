package com.eis.jsontoxml.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonToXMLContoller {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}
