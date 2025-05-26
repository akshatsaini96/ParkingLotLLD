package gate;

import config.ParkingLot;
import model.ParkingTicket;
import model.Vehicle;
import service.TicketService;

public class EntryGate {
	private final String gateId;
	private TicketService ticketService;

	public EntryGate(String gateId, TicketService ticketService) {
		super();
		this.gateId = gateId;
		this.ticketService = ticketService;
	}

	public ParkingTicket processTicket(Vehicle vehicle, ParkingLot parkingLot) {

		ParkingTicket ticket = ticketService.processTicket(vehicle, parkingLot);
		if (ticket != null)
			parkingLot.getActiveTickets().put(ticket.getTicketId(), ticket);
		return ticket;
	}

}
