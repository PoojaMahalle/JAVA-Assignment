package comparator;

import java.util.ArrayList;
import java.util.Collections;

import comparable.Student;

public class StudentComparator {

	public static void main(String[] args) {
		ArrayList<Student1> al=new ArrayList<>();
		
		al.add(new Student1(1,"Raj","Computer",60));
		al.add(new Student1(2,"Ram","IT",65));
		al.add(new Student1(3,"Riya","Mech",70));
		al.add(new Student1(4,"Rahul","IT",75));
		al.add(new Student1(5,"Pooja","ENTC",80));
		al.add(new Student1(6,"Lina","Computer",85));
		al.add(new Student1(7,"Tina","ENTC",70));
		al.add(new Student1(8,"Mina","Mech",65));
		al.add(new Student1(9,"Bharti","Computer",60));
		
		//Collections.sort(al, new StudentNameComparator());
		Collections.sort(al, new StudentDeptComparator());
		System.out.println(al);

	}

}
