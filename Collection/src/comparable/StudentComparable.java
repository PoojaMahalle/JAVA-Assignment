package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparable {

	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Student> al=new ArrayList<>();
		
		al.add(new Student(1,"Raj","Computer",60));
		al.add(new Student(2,"Ram","TI",65));
		al.add(new Student(3,"Riya","Mech",70));
		al.add(new Student(4,"Rahul","IT",75));
		al.add(new Student(5,"Pooja","ENTC",80));
		al.add(new Student(6,"Lina","Computer",85));
		al.add(new Student(7,"Tina","ENTC",70));
		al.add(new Student(8,"Mina","Mech",65));
		al.add(new Student(9,"Bharti","Computer",60));
		
		Collections.sort(al);
		System.out.println(al);

	}

}
