package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	public Department findByDepartmentId(String id);
	public Department findByDepartmentName(String name);
	public List<Department> findAllDepartmentByInstituteId(String id);
}
