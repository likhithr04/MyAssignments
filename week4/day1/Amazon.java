package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("cash on delivery in amazon class");

	}

	@Override
	public void upiPayments() {

		System.out.println("upi in amazon class");
	}

	@Override
	public void cardPayments() {

		System.out.println("card in amazon class");

	}

	@Override
	public void internetBanking() {

		System.out.println("internet banking in amazon class");
	}

	public static void main(String[] args) {
		
		Amazon options =new Amazon();
		options.cashOnDelivery();
		options.upiPayments();
		options.cardPayments();
        options.internetBanking();
        options.recordPaymentDetails();
	}
	
}
