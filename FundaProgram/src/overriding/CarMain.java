package overriding;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: name,brand,launchyear,price");
		
		String name=sc.next();
		String brand=sc.next();
		int launchyear=sc.nextInt();
		int price=sc.nextInt();
		
		Maruti m1 = new Maruti();
		m1.setCarData(name, brand, launchyear, price);
		
		System.out.println("Enter: id,modelno,paymentmode,installment");
		int id=sc.nextInt();
		String modelno=sc.next();
		String payment=sc.next();
		int installment=sc.nextInt();
		
		m1.setMarutiData(id, modelno, payment, installment);
		m1.discount();
		m1.display();

	}

}
