package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.Department;
import com.api.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public Department fetchByDepartmentId(String id) {
		return departmentRepository.findByDepartmentId(id);
	}
	
	public Department fetchByDepartmentName(String name) {
		return departmentRepository.findByDepartmentName(name);
	}
	
	public List<Department> fetchAllDepartmentByInstituteId(String id){
		return departmentRepository.findAllDepartmentByInstituteId(id);
	}
}
