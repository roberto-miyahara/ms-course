package com.mspoc.hrworker.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable{
	
	private static final long serialVersionUID = 1L;
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
