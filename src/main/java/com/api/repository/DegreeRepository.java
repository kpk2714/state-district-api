package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.Degree;


@Repository
public interface DegreeRepository extends JpaRepository<Degree, Integer> {

	public Degree findByDegreeId(String id);
	public Degree findByDegreeName(String name);
	public List<Degree> findAllDegreeByInstituteId(String id);
}
