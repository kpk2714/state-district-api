package com.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class District {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String stateId;
	private String districtId;
	private String districtName;
	
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
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	
	public District(int id, String stateId, String districtId, String districtName) {
		super();
		this.id = id;
		this.stateId = stateId;
		this.districtId = districtId;
		this.districtName = districtName;
	}
	
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "District [id=" + id + ", stateId=" + stateId + ", districtId=" + districtId + ", districtName="
				+ districtName + "]";
	}
}
