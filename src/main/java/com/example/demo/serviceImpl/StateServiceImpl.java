package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.State;
import com.example.demo.repository.StateRepository;
import com.example.demo.service.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;
	
	@Override
	public List<State> getAll() {
		// TODO Auto-generated method stub
		return stateRepository.findAll();
	}

}
