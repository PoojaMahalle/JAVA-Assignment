package linklist;

import java.util.ArrayList;
import java.util.Scanner;


public class ContainmentOfStudent {

	public static void main(String[] args) {
		
//		ArrayList<Integer> s1= new ArrayList<>();
//		s1.add(90);
//		s1.add(60);
//		s1.add(50);
//		s1.add(80);
//		s1.add(40);
//		
//		ArrayList<Integer> s2= new ArrayList<>();
//		s2.add(90);
//		s2.add(60);
//		s2.add(70);
//		s2.add(80);
//		s2.add(80);
//		
//		ArrayList<Integer> s3= new ArrayList<>();
//		s3.add(50);
//		s3.add(60);
//		s3.add(60);
//		s3.add(80);
//		s3.add(40);
//		
//		ArrayList<Student> al= new ArrayList<>();
//
//		al.add(new Student(101,"Raj","Computer",s1));
//		al.add(new Student(102,"Riya","IT",s2));
//		al.add(new Student(103,"Ram","Computer",s3));
		
		ArrayList<Student> al=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Students count");
		int stud=sc.nextInt();
		for(int i=0; i<stud; i++)
		{
			System.out.println("Enter: id,name,dept");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			ArrayList<Integer> s1= new ArrayList<>();
			
			for(int j=0; j<5; j++)
			{
				System.out.println("Enter marks");
				int m=sc.nextInt();
				s1.add(m);
			}
			al.add(new Student(id,name,dept,s1));
			
		}
		for(Student s: al)
		{
			int sum=0;
			for(Integer i: s.marks)
			{
				sum+=i;
			}
			double percentage=sum/s.marks.size();
			if(percentage>65);
			System.out.println(s.name+" "+percentage);
		}
	}

}
