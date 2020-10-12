package com.pitang.desafio.domain;

import java.io.Serializable;

public class Carro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int year;
	private String licensePlate;
	private String model;
	private String color;

	public Carro() {

	}

	public Carro(int year, String licensePlate, String model, String color) {
		super();
		this.year = year;
		this.licensePlate = licensePlate;
		this.model = model;
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
