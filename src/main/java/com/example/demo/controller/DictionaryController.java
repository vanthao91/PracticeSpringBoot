package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.DictionaryService;
import com.example.demo.service.StateService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@GetMapping(value = "/admin/dicSearch")
	@ResponseBody
	public List<Object> doSearch(@RequestParam String tableName){
		System.out.println(tableName);
		List<Object> rs = dictionaryService.doSearch(tableName);
		System.out.println(rs);
		return rs;
	}

}
