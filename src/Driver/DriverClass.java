package Driver;

import config.ParkingLot;
import gate.EntryGate;
import gate.ExitGate;
import model.BikeParkingSlot;
import model.CarParkingSlot;
import model.CarVehicle;
import model.ParkingFloor;
import model.ParkingSlot;
import model.ParkingTicket;
import model.Vehicle;
import model.enums.SlotType;
import model.enums.VehicleType;
import paymentStrategy.impl.HourlyPaymentStrategy;
import service.TicketService;

public class DriverClass {

	public static void main(String[] args) {
		ParkingLot parkingLot = ParkingLot.getInstance();
		ParkingFloor parkingFloor1 = new ParkingFloor("floor1");
		parkingLot.getParkingFloors().add(parkingFloor1);
		ParkingSlot parkingSlot1 = new CarParkingSlot("CarSlot1", SlotType.CAR);
		ParkingSlot parkingSlot2 = new BikeParkingSlot("BikeSlot1", SlotType.BIKE);
		parkingFloor1.addParkingSlot(SlotType.CAR, parkingSlot1);
		parkingFloor1.addParkingSlot(SlotType.BIKE, parkingSlot2);
		Vehicle vehicle1 = new CarVehicle("sg123", VehicleType.CAR);
		TicketService ticketService = new TicketService();
		EntryGate entryGate = new EntryGate("1", ticketService);
		ParkingTicket ticket = entryGate.processTicket(vehicle1, parkingLot);
		System.out.println(ticket);
		ExitGate exitGate = new ExitGate(parkingLot, new HourlyPaymentStrategy());
		ticket = exitGate.closeTicket(ticket);
		System.out.println(ticket);

	}

}
