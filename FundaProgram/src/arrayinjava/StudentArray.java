package arrayinjava;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		int id,marks;
		String name,dept;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size=sc.nextInt();
		
		Student stud[]= new Student[size];
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Student details: ");
			System.out.println("Enter Student Id: ");
			id=sc.nextInt();
			System.out.println("Enter student name; ");
			name=sc.next();
			System.out.println("Enter student dept: ");
			dept=sc.next();
			System.out.println("Enter student marks: ");
			marks=sc.nextInt();
			
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			
			stud[i]=s;
			System.out.println(s);
		}

	}

}
