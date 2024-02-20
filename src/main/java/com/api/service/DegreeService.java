package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.Degree;
import com.api.repository.DegreeRepository;

@Service
public class DegreeService {

	@Autowired
	private DegreeRepository degreeRepository;
	
	public Degree saveDegree(Degree degree) {
		return degreeRepository.save(degree);
	}
	
	public Degree fetchByDegreeId(String id) {
		return degreeRepository.findByDegreeId(id);
	}
	
	public Degree fetchByDegreeName(String name) {
		return degreeRepository.findByDegreeName(name);
	}
	
	public List<Degree> fetchAllDegreeByInstituteId(String id){
		return degreeRepository.findAllDegreeByInstituteId(id);
	}
}
