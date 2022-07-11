package collection;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<>();

		al.add(new Student(101,"Raj","Computer",70));
		al.add(new Student(102,"Riya","IT",60));
		al.add(new Student(103,"Ram","Computer",50));
		al.add(new Student(104,"Shyam","IT",70));
		al.add(new Student(105,"Bharti","Computer",60));
		al.add(new Student(106,"Pooja","ENTC",75));
		al.add(new Student(107,"Shiv","Computer",70));
		al.add(new Student(108,"Sneha","ENTC",75));
		al.add(new Student(109,"Vijay","Computer",70));
		al.add(new Student(110,"Sachin","IT",50));
		
		for(Student s:al)
		{
			if(s.dept.equalsIgnoreCase("Computer") && s.marks>60)
				System.out.println(s);
		}
	}

}
