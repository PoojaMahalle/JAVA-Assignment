package car;

import java.util.Scanner;

public class Car3 {

	public static void main(String[] args) {
		int id, price, installment;
		String name, year, brandname, payment;
		Scanner sc = new Scanner(System.in);

		Car2 c1 = new Car2();
		System.out.println("Enter: id,price,name,year,brandname,paymentmode,installment");
		id = sc.nextInt();
		price = sc.nextInt();//5000
		name = sc.next();
		year = sc.next();
		brandname = sc.next();
		payment = sc.next();
		installment = sc.nextInt();

		c1.setId(id);
		c1.setPrice(price);//5000
		c1.setName(name);
		c1.setYear(year);
		c1.setBrandname(brandname);
		c1.setPayment(payment);
		c1.setInstallment(installment);
		System.out.println(c1);

		Discount d1 = new Discount();

		
		d1.dis(c1);
		
		
		

	

	}

}
