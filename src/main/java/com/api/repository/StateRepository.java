package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

	public State findByStateId(String id);
	public State findByStateName(String name);
	public State findByStateIdAndStateName(String id,String name);
}
