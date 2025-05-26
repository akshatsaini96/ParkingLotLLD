package model;

import model.enums.VehicleType;

public abstract class Vehicle {
	private final String vehicleNumber;
	private final VehicleType vehicleType;

	public Vehicle(String vehicleNumber, VehicleType vehicleType) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

}
