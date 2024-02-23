package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Degree;
import com.api.service.DegreeService;

@RestController
public class DegreeController {

	@Autowired
	private DegreeService degreeService;
	
	@PostMapping("/saveDegree")
	public Degree saveDegree(@RequestBody Degree degree) throws Exception {
		Degree degreeObj = null;
		
		if(degree.getDegreeId()!=null && degree.getDegreeName()!=null) {
			
			if(degreeService.fetchByDegreeId(degree.getDegreeId())!=null && degreeService.fetchByDegreeName(degree.getDegreeName())!=null) {
				throw new Exception("Degree is already registered !!!");
			}
			
			degreeObj = degreeService.saveDegree(degree);
		}
		
		return degreeObj;
	}
	
	@GetMapping("/getAllDegree/instituteId={insId}")
	@CrossOrigin(origins = "https://65d81cb2f98ebb898c584470--portal-syn.netlify.app")
	public List<Degree> getAllDegreeByInstituteId(@PathVariable String insId){
		return degreeService.fetchAllDegreeByInstituteId(insId);
	}
}
