package model;

import model.enums.SlotType;

public class BikeParkingSlot extends ParkingSlot {
	public BikeParkingSlot(String slotId, SlotType slotType) {
		super(slotId, slotType);
	}

	@Override
	public int getParkingRate() {
		return 10;
	}
}
