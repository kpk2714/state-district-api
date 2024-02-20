package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.University;
import com.api.repository.UniversityRepository;

@Service
public class UniversityService {

	@Autowired
	private UniversityRepository universityRepository;
	
	public University saveUniversity(University university) {
		return universityRepository.save(university);
	}
	
	public University fetchByUniversityId(String id) {
		return universityRepository.findByUniversityId(id);
	}
	
	public University fetchByUniversityName(String name) {
		return universityRepository.findByUniversityName(name);
	}
	
	public List<University> fetchAllUniversityByStateId(String id){
		return universityRepository.findAllUniversityByStateId(id);
	}
}
