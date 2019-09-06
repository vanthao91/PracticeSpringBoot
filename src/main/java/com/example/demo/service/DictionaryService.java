package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Dictionary;


public interface DictionaryService {
	List<Dictionary> getAll();
	List<Object> doSearch(String tableName);
}
