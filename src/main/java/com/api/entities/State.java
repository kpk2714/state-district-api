package com.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String stateId;
	private String stateName;
	
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

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public State(int id, String stateId, String stateName) {
		super();
		this.id = id;
		this.stateId = stateId;
		this.stateName = stateName;
	}

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", stateId=" + stateId + ", stateName=" + stateName + "]";
	}
}
