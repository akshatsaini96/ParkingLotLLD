package service;

import model.ParkingTicket;
import paymentStrategy.PaymentStrategy;

public class PaymentService {
	private final PaymentStrategy paymentStrategy;

	public PaymentService(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public double processPayment(ParkingTicket parkingTicket) {
		return (parkingTicket.getEntryTime() - System.currentTimeMillis()) * paymentStrategy.getFee();

	}

}
