package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.DictionaryService;
import com.example.demo.service.StateService;

@Controller
public class DictionaryController {
	
	@Autowired
	private DictionaryService dictionaryService;
	private StateService stateService;

	@GetMapping(value = "/admin/dictionary")
	public String getDictionary (Model model)
	{	
		model.addAttribute("dictionaries", dictionaryService.getAll());
		return "dictionary";
	}

}
