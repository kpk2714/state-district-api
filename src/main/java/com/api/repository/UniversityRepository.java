package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {

	public University findByUniversityId(String id);
	public University findByUniversityName(String name);
	public List<University> findAllUniversityByStateId(String id);
}
