package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.Institute;
import com.api.repository.InstituteRepository;

@Service
public class InstituteService {

	@Autowired
	private InstituteRepository instituteRepository;
	
	public Institute saveInstitute(Institute institute) {
		return instituteRepository.save(institute);
	}
	
	public Institute fetchByInstituteId(String id) {
		return instituteRepository.findByInstituteId(id);
	}
	
	public Institute fetchByInstituteName(String name) {
		return instituteRepository.findByInstituteName(name);
	}
	
	public List<Institute> fetchInstituteByStateId(String id){
		return instituteRepository.findAllInstituteByUniversityId(id);
	}
}
