package com.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Degree {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String degreeId;
	private String degreeName;
	private String instituteId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDegreeId() {
		return degreeId;
	}
	public void setDegreeId(String degreeId) {
		this.degreeId = degreeId;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	public String getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}
	
	
	public Degree(int id, String degreeId, String degreeName, String instituteId) {
		super();
		this.id = id;
		this.degreeId = degreeId;
		this.degreeName = degreeName;
		this.instituteId = instituteId;
	}
	public Degree() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Degree [id=" + id + ", degreeId=" + degreeId + ", degreeName=" + degreeName + ", instituteId="
				+ instituteId + "]";
	}
	
	
}
