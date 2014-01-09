package fr.afcepf.atod19.jungle.mbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class Car implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String model;
	int year;
	String manufacturer;
	String color;
	
	
	public Car() {
		super();
	}
	
	public Car(String model, int year, String manufacturer, String color) {
		super();
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	

}
