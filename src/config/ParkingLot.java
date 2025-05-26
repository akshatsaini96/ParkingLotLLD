package config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gate.EntryGate;
import gate.ExitGate;
import model.ParkingFloor;
import model.ParkingTicket;

public class ParkingLot {
	private List<ParkingFloor> parkingFloors = new ArrayList<ParkingFloor>();
	private List<EntryGate> entryGates = new ArrayList<EntryGate>();
	private List<ExitGate> exitGates = new ArrayList<ExitGate>();
	private final Map<String, ParkingTicket> activeTickets = new HashMap<>();

	// lazy instantiation
	public synchronized static ParkingLot getInstance() {
		if (parkingLotInstance == null)
			parkingLotInstance = new ParkingLot();
		return parkingLotInstance;

	}

	public List<ParkingFloor> getParkingFloors() {
		return parkingFloors;
	}

	public void setParkingFloors(List<ParkingFloor> parkingFloors) {
		this.parkingFloors = parkingFloors;
	}

	public List<EntryGate> getEntryGates() {
		return entryGates;
	}

	public void setEntryGates(List<EntryGate> entryGates) {
		this.entryGates = entryGates;
	}

	public List<ExitGate> getExitGates() {
		return exitGates;
	}

	public void setExitGates(List<ExitGate> exitGates) {
		this.exitGates = exitGates;
	}

	private static ParkingLot parkingLotInstance;

	private ParkingLot() {
	}

	public Map<String, ParkingTicket> getActiveTickets() {
		return activeTickets;
	}

}
