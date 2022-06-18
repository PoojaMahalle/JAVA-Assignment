package student1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: id,name,percentage,dept,city,contact");
		int id = sc.nextInt();
		String name = sc.next();
		int percentage=sc.nextInt();
		String dept=sc.next();
		String city=sc.next();
		String contact=sc.next();
		
		Parameterize p = new Parameterize(id,name,percentage,dept,city,contact);
		
		System.out.println(p);
		p.perc();

	}

}
