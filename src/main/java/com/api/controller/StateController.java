package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.State;
import com.api.service.StateService;

@RestController
public class StateController {

	@Autowired
	private StateService stateService;
	
	@PostMapping("/saveState")
	public State saveState(@RequestBody State state) throws Exception {
		
		State stateObj = null;
		
		if(state.getStateId()!=null && state.getStateName()!=null) {
			if(stateService.fetchByStateId(state.getStateId())!=null || stateService.fetchByStateName(state.getStateName())!=null)
				throw new Exception("State is already register !!!");
			
			stateObj = stateService.saveState(state);
		}
		
		return stateObj;
	}
	
	@GetMapping("/getAllState")
	//@CrossOrigin(origins = "http://localhost:4200")
	public List<State> getAllState(){
		return stateService.findAllState();
	}
}
