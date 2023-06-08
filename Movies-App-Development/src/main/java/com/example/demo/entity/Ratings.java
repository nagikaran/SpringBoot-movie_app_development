package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Ratings {
	@Id
	private String tconst;
	private Double averagerating;
	private Integer numvotes;
	
	public String getTconst() {
		return tconst;
	}
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}
	public Double getAveragerating() {
		return averagerating;
	}
	public void setAveragerating(Double averagerating) {
		this.averagerating = averagerating;
	}
	public Integer getNumvotes() {
		return numvotes;
	}
	public void setNumvotes(Integer numvotes) {
		this.numvotes = numvotes;
	}

}
