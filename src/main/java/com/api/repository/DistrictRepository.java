package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

	public District findByDistrictId(String id);
	public District findByDistrictName(String name);
	public List<District> findDistrictByStateId(String id);
}
