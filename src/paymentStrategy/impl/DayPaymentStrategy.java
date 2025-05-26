package paymentStrategy.impl;

import paymentStrategy.PaymentStrategy;

public class DayPaymentStrategy implements PaymentStrategy {

	@Override
	public int getFee() {
		return 400;
	}

}
