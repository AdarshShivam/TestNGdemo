package BatchTesting;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test
	public void Paymentindollar() {
		System.out.println("Payment done in dollar");
	}
	
	@Test
	public void Paymentinrupees() {
		System.out.println("Payment done in rupees");
	}
}
