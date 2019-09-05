package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayoutController {

	@GetMapping(value = {"", "/dashboard"})
	public String getDashboard ()
	{
		return "dashboard";
	}
}
