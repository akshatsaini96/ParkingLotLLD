package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.enums.SlotType;

public class ParkingFloor {
	private final String floorId;
	private final HashMap<SlotType, List<ParkingSlot>> parkingSlots;

	public ParkingFloor(String floorId) {
		super();
		this.floorId = floorId;
		parkingSlots = new HashMap<SlotType, List<ParkingSlot>>();
	}

	public String getFloorId() {
		return floorId;
	}

	public void addParkingSlot(SlotType slotType, ParkingSlot parkingSlot) {
		if (!parkingSlots.containsKey(slotType))
			parkingSlots.put(slotType, new ArrayList<ParkingSlot>());
		parkingSlots.get(slotType).add(parkingSlot);
	}

	public List<ParkingSlot> getAvailableSlots(SlotType slotType) {
		if (parkingSlots.containsKey(slotType))
			return parkingSlots.get(slotType);
		return null;
	}

}
