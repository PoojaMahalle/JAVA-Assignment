package inheritancepolymorphism;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id,name,performance,salary,contact,address,gender");
		
		int id=sc.nextInt();
		String name=sc.next();
		String subject=sc.next();
		char performance=sc.next().charAt(0);
		int salary=sc.nextInt();
		String contact=sc.next();
		String address=sc.next();
		String gender=sc.next();
		
		
		Faculty f1 = new Faculty();
		f1.setPersonData(name, contact, address, gender);
		f1.setFacultyData(id, salary, subject, performance);
		System.out.println(f1);
		
		f1.bonus();
		System.out.println();

	}

}
