package model;

import java.util.UUID;

public class ParkingTicket {
	private String TicketId;
	private Vehicle vehicle;
	private String parkingFloorId;
	private ParkingSlot parkingSlot;
	private long entryTime;
	private Double amount;

	public ParkingTicket(Vehicle vehicle, String parkingFloorId, ParkingSlot parkingSlot, long entryTime) {
		super();
		this.TicketId = UUID.randomUUID().toString();
		this.vehicle = vehicle;
		this.parkingFloorId = parkingFloorId;
		this.parkingSlot = parkingSlot;
		this.entryTime = entryTime;
	}

	public ParkingTicket() {

	}

	public String getTicketId() {
		return TicketId;
	}

	public void setTicketId(String ticketId) {
		TicketId = ticketId;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getParkingFloorId() {
		return parkingFloorId;
	}

	public void setParkingFloorId(String parkingFloorId) {
		this.parkingFloorId = parkingFloorId;
	}

	public ParkingSlot getParkingSlot() {
		return parkingSlot;
	}

	public void setParkingSlot(ParkingSlot parkingSlot) {
		this.parkingSlot = parkingSlot;
	}

	public long getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ParkingTicket [TicketId=" + TicketId + ", parkingFloorId=" + parkingFloorId + ", parkingSlot="
				+ parkingSlot + ", entryTime=" + entryTime + ", amount=" + amount + "]";
	}

}
