package com.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Institute {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String universityId;
	private String instituteId;
	private String instituteName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUniversityId() {
		return universityId;
	}
	public void setUniversityId(String universityId) {
		this.universityId = universityId;
	}
	public String getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	
	public Institute(int id, String universityId, String instituteId, String instituteName) {
		super();
		this.id = id;
		this.universityId = universityId;
		this.instituteId = instituteId;
		this.instituteName = instituteName;
	}
	
	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Institute [id=" + id + ", universityId=" + universityId + ", instituteId=" + instituteId
				+ ", instituteName=" + instituteName + "]";
	}
}
