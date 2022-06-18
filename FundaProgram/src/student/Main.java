package student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: id,name,m1,m2,m3,dept");
		int id = sc.nextInt();
		String name = sc.next();
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		String dept=sc.next();
		
		Student i = new Student();
		i.setId(id);
		i.setName(name);
		i.setM1(m1);
		i.setM2(m2);
		i.setM3(m3);
		i.setDept(dept);
		
		Marks m = new Marks();
		m.marks(i);
		
		Percentage p = new Percentage();
		p.p(m);
		
		
		System.out.println(i);
		System.out.println(m);
		System.out.println(p);
		
		Result r = new Result();
		r.r(p);
		
				
	}

}
