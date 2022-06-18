package arrayinjava;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Student stud[] = new Student[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter "+(i+1)+" Student details: ");
			System.out.println("Enter the id: ");
			int id = sc.nextInt();
			System.out.println("Enter the name: ");
			String name=sc.next();
			System.out.println("Enter the dept: ");
			String dept=sc.next();
			System.out.println("Enter the marks: ");
			int marks=sc.nextInt();
			
			//stud[i]= new Student(id,name,dept,marks);
			
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			
			stud[i]=s;
			
		}
		
		//for each loop traversing group of element
		for(Student s:stud)//map the array with its type of variable
		{
			//if(s.name.startsWith("R"))
					System.out.println(s);
		}

	}

}
