package classandobject;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		System.out.println("Enter: accno, name, amt, contact");
		int accno=sc.nextInt();
		String name = sc.next();
		int balance = sc.nextInt();
		String contact = sc.next();
		
		a1.setAccno(accno);
		a1.setName(name);
		a1.setBalance(balance);
		a1.setContact(contact);
		
		System.out.println(a1);
		
//		Bank b1 = new Bank();
//		b1.gpay(1000, a1);
//		
//		System.out.println("Balance is: "+a1.getBalance());
//		a1.setContact("896541273");
//		System.out.println(a1);

	}

}
