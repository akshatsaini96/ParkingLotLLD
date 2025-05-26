package gate;

import config.ParkingLot;
import model.ParkingSlot;
import model.ParkingTicket;
import paymentStrategy.PaymentStrategy;

public class ExitGate {

	private String exitGateId;
	private ParkingLot parkingLot;
	PaymentStrategy paymentStrategy;

	public ExitGate(ParkingLot parkingLot, PaymentStrategy paymentStrategy) {
		super();
		this.parkingLot = parkingLot;
		this.paymentStrategy = paymentStrategy;
	}

	public ParkingTicket closeTicket(ParkingTicket parkingTicket) {
		ParkingSlot parkingSlot = parkingTicket.getParkingSlot();
		parkingSlot.setIsOccupied(false);
		int rate = parkingSlot.getParkingRate();
		parkingLot.getActiveTickets().remove(parkingTicket.getTicketId());
		int fee = paymentStrategy.getFee();
		parkingTicket.setAmount((double) (fee * rate));
		return parkingTicket;

	}

}
