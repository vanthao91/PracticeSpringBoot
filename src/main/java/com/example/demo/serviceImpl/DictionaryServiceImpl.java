package com.example.demo.serviceImpl;

import java.util.List;

import com.example.demo.repository.DictionarySearchCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Dictionary;
import com.example.demo.repository.DictionaryRepository;
import com.example.demo.service.DictionaryService;

@Service
public class DictionaryServiceImpl implements DictionaryService {

	@Autowired
	private DictionaryRepository dictionaryRepository;

	@Override
	public List<Dictionary> getAll() {
		// TODO Auto-generated method stub
		return dictionaryRepository.findAll();
	}

	@Override
	public List<Object> doSearch(String tableName) {
		return dictionaryRepository.search(tableName);
	}
}
