package demo;

abstract class Payment {
	abstract void pay(int amount);
	
    void showPaymentGateway() {
    	System.out.println("using secure payment Gateway ...");
    	
    }

}
class CreditCardPayment extends Payment {
	void pay(int amount) {
		System.out.println("paid $ " + amount + " using credit card .");
		
	}
	
}
class UPIPayment extends Payment {
	void pay(int amount) {
		System.out.println("paid $ " + amount + " using  UPI .");
	}
}

class CashPayment extends Payment {
	void pay(int amount) {
		System.out.println("paid $ " + amount + " in cash.");
	}
}
public class AbstractionExample {
	public static void main(String[] args) {
		Payment P1 = new CreditCardPayment();
		Payment P2 = new UPIPayment();
		Payment P3 = new CashPayment();
		
		P1.showPaymentGateway();
		P1.pay(500);
		
		P2.showPaymentGateway();
		P2.pay(1000);
	
		P3.showPaymentGateway();
		P3.pay(1500);
		
		
	}
}






