package com.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String districtId;
	private String postId;
	private String postName;
	private String pinCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public Post(int id, String districtId, String postId, String postName, String pinCode) {
		super();
		this.id = id;
		this.districtId = districtId;
		this.postId = postId;
		this.postName = postName;
		this.pinCode = pinCode;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", districtId=" + districtId + ", postId=" + postId + ", postName=" + postName
				+ ", pinCode=" + pinCode + "]";
	}
	
	
}
