package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.Institute;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, Integer> {

	public Institute findByInstituteId(String id);
	public Institute findByInstituteName(String name);
	public List<Institute> findAllInstituteByUniversityId(String id);
}
