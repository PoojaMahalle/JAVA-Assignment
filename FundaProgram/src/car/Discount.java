package car;

public class Discount {
	double discount;

	void dis(Car2 a) {
		int price = a.getPrice();//
		int installment = a.getInstallment();
		String payment = a.getPayment();
		if (installment == 0) {
			if (payment.equals("cash")) {
				discount = price * 40 / 100;
				System.out.println("The discount is " + discount);
			} else {
				discount = price * 35 / 100;
				System.out.println("The discount is " + discount);
			}

		} else if (installment == 1) {
			discount = price * 30 / 100;
			System.out.println("The discount is " + discount);
		} else if (installment == 2) {
			discount = price * 20 / 100;
			System.out.println("The discount is " + discount);
		} else if (installment == 3) {
			discount = price * 10 / 100;
			System.out.println("The discount is " + discount);
		}
		 else {
			System.out.println("No discount");
		}
	}
}
