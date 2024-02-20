package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.District;
import com.api.repository.DistrictRepository;

@Service
public class DistrictService {

	@Autowired
	private DistrictRepository districtRepository;
	
	public District saveDistrict(District district) {
		return districtRepository.save(district);
	}
	
	public District fetchByDistrictId(String id) {
		return districtRepository.findByDistrictId(id);
	}
	
	public District fetchByDistrictName(String name) {
		return districtRepository.findByDistrictName(name);
	}
	
	public List<District> fetchDistrictByStateId(String id){
		return districtRepository.findDistrictByStateId(id);
	}
}
