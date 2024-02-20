package com.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String departmentId;
	private String departmentName;
	private String instituteId;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}
	
	public Department(int id, String departmentId, String departmentName, String instituteId) {
		super();
		Id = id;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.instituteId = instituteId;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Department [Id=" + Id + ", departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", instituteId=" + instituteId + "]";
	}
}
