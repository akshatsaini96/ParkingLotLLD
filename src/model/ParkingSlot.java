package model;

import model.enums.SlotType;

public abstract class ParkingSlot {

	private final String slotId;
	private final SlotType slotType;
	private Boolean isOccupied;

	public ParkingSlot(String slotId, SlotType slotType) {
		this.slotId = slotId;
		this.slotType = slotType;
		this.isOccupied = false;
	}

	public abstract int getParkingRate();

	public String getSlotId() {
		return slotId;
	}

	public SlotType getSlotType() {
		return slotType;
	}

	public Boolean getIsOccupied() {
		return isOccupied;
	}

	public void setIsOccupied(Boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

}
