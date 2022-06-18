package student1;

import java.util.Scanner;

public class StudInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: id,name,percentage,dept,city,contact");
		int id = sc.nextInt();
		String name = sc.next();
		int percentage=sc.nextInt();
		String dept=sc.next();
		String city=sc.next();
		String contact=sc.next();
		
		Student i = new Student();
		i.setId(id);
		i.setName(name);
		i.setPercentage(percentage);
		i.setDept(dept);
		i.setCity(city);
		i.setContact(contact);
		
		System.out.println(i);
		i.perc();
		
		

	}

}
