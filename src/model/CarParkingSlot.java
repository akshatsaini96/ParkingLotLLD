package model;

import model.enums.SlotType;

public class CarParkingSlot extends ParkingSlot {

	public CarParkingSlot(String slotId, SlotType slotType) {
		super(slotId, slotType);
	}

	@Override
	public int getParkingRate() {
		return 20;
	}

}
