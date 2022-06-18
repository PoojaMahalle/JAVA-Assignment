package classandobject;

import java.util.Scanner;

public class Student2 {
	
	int id, marks;
	String name, dept, sports;

	void setData(int id, String name, String dept, int marks, String sports) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
		this.sports = sports;
	}
	
	public String toString() {
		return id + " " + name + " " + dept + " " + marks + " " + sports;
	}
	
	void sportsMarks() {
		if (sports.equals("Batminton")) {
			marks = marks + 5;
			System.out.println("New marks are: " + marks);
		} else if (sports.equals("Hockey")) {
			marks = marks + 3;
			System.out.println("New marks are: " + marks);
		} else if (sports.equals("KhoKho")) {
			marks = marks + 2;
			System.out.println("New marks are: " + marks);
		} else if (sports.equals("No")) {
			System.out.println("New marks are: " + marks);
		} else {
			marks = marks + 1;
			System.out.println("New marks are: " + marks);
		}

	}
	public static void main(String[] args) {
		int id,marks;
		String name,dept,sports;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the students details: ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		marks=sc.nextInt();
		sports=sc.next();
				
		Student2 s1 = new Student2();
		s1.setData(id, name, dept, marks, sports);
		System.out.println(s1);
		s1.sportsMarks();
	}

}
