package com.mspoc.payroll.entities;

import java.io.Serializable;

public class Worker implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	private Double dailyIncome;
	
	public Worker() {
		
	}

	public Worker(long id, String name, Double dailyIncome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}


}
