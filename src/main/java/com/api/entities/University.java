package com.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String stateId;
	private String universityId;
	private String universityName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getUniversityId() {
		return universityId;
	}
	public void setUniversityId(String universityId) {
		this.universityId = universityId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public University(int id, String stateId, String universityId, String universityName) {
		super();
		this.id = id;
		this.stateId = stateId;
		this.universityId = universityId;
		this.universityName = universityName;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", stateId=" + stateId + ", universityId=" + universityId + ", universityName="
				+ universityName + "]";
	}
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
}

