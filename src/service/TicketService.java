package service;

import java.util.UUID;

import config.ParkingLot;
import model.ParkingFloor;
import model.ParkingSlot;
import model.ParkingTicket;
import model.Vehicle;
import model.enums.SlotType;
import model.enums.VehicleType;
import paymentStrategy.PaymentStrategy;

public class TicketService {
	PaymentService paymentService;

	public ParkingTicket processTicket(Vehicle vehicle, ParkingLot parkingLot) {

		for (ParkingFloor pF : parkingLot.getParkingFloors()) {
			ParkingSlot parkingSlot = pF.getAvailableSlots(getSlotType(vehicle)).stream().filter(pS -> {
				if (pS.getIsOccupied() == true)
					return false;
				else
					return true;
			}).findFirst().orElse(null);
			if (parkingSlot != null)

			{
				ParkingTicket parkingTicket = new ParkingTicket();
				parkingTicket.setTicketId(UUID.randomUUID().toString());
				parkingSlot.setIsOccupied(true);
				parkingTicket.setEntryTime(System.currentTimeMillis());
				parkingTicket.setParkingFloorId(pF.getFloorId());
				parkingTicket.setVehicle(vehicle);
				parkingTicket.setParkingSlot(parkingSlot);
				return parkingTicket;

			}

		}

		return null;
	}

	public void closeTicket(ParkingTicket parkingTicket, PaymentStrategy paymentStrategy) {
		paymentService = new PaymentService(paymentStrategy);
		double amount = paymentService.processPayment(parkingTicket);
		parkingTicket.setAmount(amount);
	}

	public SlotType getSlotType(Vehicle vehicle) {

		VehicleType vehicleType = vehicle.getVehicleType();

		switch (vehicleType) {
		case BIKE:
			return SlotType.BIKE;
		case CAR:
			return SlotType.CAR;
		case EV:
			return SlotType.EV;
		default:
			return SlotType.CAR;
		}

	}

}
