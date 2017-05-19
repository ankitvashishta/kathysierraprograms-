package chapter6.serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public Vehicle(String type, String color) {
		this.vehicleType = type;
		this.color = color;
	}

	private String vehicleType;

	private String color;

	// private String weight;

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/*
	 * public String getWeight() { return weight; }
	 * 
	 * public void setWeight(String weight) { this.weight = weight; }
	 */

}
