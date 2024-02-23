package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Department;
import com.api.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department department) throws Exception {
		Department departmentObj = null;
		
		if(department.getDepartmentId()!=null && department.getDepartmentName()!=null) {
			
			if(departmentService.fetchByDepartmentId(department.getDepartmentId())!=null && departmentService.fetchByDepartmentName(department.getDepartmentName())!=null) {
				throw new Exception("Department is already registered !!!");
			}
			
			departmentObj = departmentService.saveDepartment(department);
		}
		
		return departmentObj;
	}
	
	@GetMapping("/getAllDepartment/instituteId={insId}")
	@CrossOrigin(origins = "https://65d81cb2f98ebb898c584470--portal-syn.netlify.app")
	public List<Department> getAllDepartmentByInstituteId(@PathVariable String insId){
		return departmentService.fetchAllDepartmentByInstituteId(insId);
	}
}
