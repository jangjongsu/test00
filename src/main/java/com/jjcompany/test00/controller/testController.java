package com.jjcompany.test00.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

	@RequestMapping(value = "/")
	public String index() {
		return"test";
	}
}
