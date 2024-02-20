package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.District;
import com.api.service.DistrictService;

@RestController
public class DistrictController {

	@Autowired
	private DistrictService districtService;
	
	@PostMapping("/saveDistrict")
	public District saveState(@RequestBody District district) throws Exception {
		
		District districtObj = null;
		
		if(district.getDistrictId()!=null && district.getDistrictName()!=null) {
			if(districtService.fetchByDistrictId(district.getDistrictId())!=null)
				throw new Exception("District is already register !!!");
			
			districtObj = districtService.saveDistrict(district);
		}
		
		return districtObj;
	}
	
	
	@GetMapping("/getAllDistrict/stateID={stateId}")
	public List<District> getAllDistrict(@PathVariable String stateId){
		return districtService.fetchDistrictByStateId(stateId);
	}
	
}
