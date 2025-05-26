package paymentStrategy.impl;

import paymentStrategy.PaymentStrategy;

public class HourlyPaymentStrategy implements PaymentStrategy {

	@Override
	public int getFee() {
		return 20;
	}

}
