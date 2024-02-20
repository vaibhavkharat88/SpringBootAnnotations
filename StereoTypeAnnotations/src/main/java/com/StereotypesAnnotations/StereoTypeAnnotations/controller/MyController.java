package com.StereotypesAnnotations.StereoTypeAnnotations.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	public String hello() {
		return "Hello Controller";
	}

}
