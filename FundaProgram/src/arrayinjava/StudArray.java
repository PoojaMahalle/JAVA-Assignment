package arrayinjava;

import java.util.Scanner;

public class StudArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int id,marks;
//		String name;
//		
//		id=sc.nextInt();
//		name=sc.next();
//		marks=sc.nextInt();
//		
//		System.out.println("Enter array size1");
//		int size1=sc.nextInt();
		Stud s1[]= new Stud[size1];
		System.out.println("Element Student details");
		for(int i=0; i<size1; i++)
		{
			System.out.println("Enter: Id,name,marks");
			id=sc.nextInt();
			name=sc.next();
			marks=sc.nextInt();
			Stud s=new Stud(id,name,marks);
			
		}
		
		System.out.println("Enter array size2");
		int size2=sc.nextInt();
		Stud s2[]= new Stud[size2];
		System.out.println("Element Student details");
		for(int i=0; i<size1; i++)
		{
			System.out.println("Enter: Id,name,marks");
			id=sc.nextInt();
			name=sc.next();
			marks=sc.nextInt();
			Stud s=new Stud(id,name,marks);
			
		}
		

	}

}
