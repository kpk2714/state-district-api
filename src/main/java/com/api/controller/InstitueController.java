package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Institute;
import com.api.service.InstituteService;

@RestController
public class InstitueController {

	@Autowired
	private InstituteService instituteService;
	
	@PostMapping("/saveInstitution")
	public Institute saveInstitute(@RequestBody Institute institute) throws Exception {
		
		Institute insObj = null;
		
		if(institute.getInstituteId()!=null && institute.getInstituteName()!=null) {
			if(instituteService.fetchByInstituteId(institute.getInstituteId())!=null && instituteService.fetchByInstituteName(institute.getInstituteName())!=null) {
				throw new Exception("Institute is already registered !!!");
			}
			
			insObj = instituteService.saveInstitute(institute);
		}
		
		return insObj;
	}
	
	
	@GetMapping("/getAllInstitute/universityId={uniId}")
	public List<Institute> getAllInstitute(@PathVariable String uniId){
		return instituteService.fetchInstituteByStateId(uniId);
	}
}
