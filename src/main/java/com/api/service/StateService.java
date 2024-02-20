package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.State;
import com.api.repository.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
	
	public State saveState(State state) {
		return stateRepository.save(state);
	}
	
	public List<State> findAllState(){
		return stateRepository.findAll();
	}
	
	public State fetchByStateId(String id) {
		return stateRepository.findByStateId(id);
	}
	
	public State fetchByStateName(String name) {
		return stateRepository.findByStateName(name);
	}
	
	public State fetchByStateIdAndStateName(String id,String name) {
		return stateRepository.findByStateIdAndStateName(id, name);
	}
}
