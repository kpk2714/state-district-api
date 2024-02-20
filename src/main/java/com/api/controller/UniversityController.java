package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.University;
import com.api.service.UniversityService;

@RestController
public class UniversityController {

	@Autowired
	private UniversityService universityService;
	
	@PostMapping("/saveUniversity")
	public University saveUniversity(@RequestBody University university) throws Exception {
		
		University universityObj = null;
		
		if(university.getUniversityId()!=null && university.getUniversityName()!=null) {
			if(universityService.fetchByUniversityId(university.getUniversityId())!=null || universityService.fetchByUniversityName(university.getUniversityName())!=null) {
				throw new Exception("University is Already Registered !!!");
			}
			
			universityObj = universityService.saveUniversity(university);
		}
		
		return universityObj;
	}
	
	@GetMapping("/getAllUniversity/stateID={stateId}")
	public List<University> getAllUniversity(@PathVariable String stateId){
		return universityService.fetchAllUniversityByStateId(stateId);
	}
}
