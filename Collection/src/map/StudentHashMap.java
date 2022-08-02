package map;

import java.util.ArrayList;
import java.util.HashMap;

import comparator.Student1;

public class StudentHashMap {

	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<>();
		
		al.add(new Student(11,"Raj","Computer",60));
		al.add(new Student(20,"Ram","IT",65));
		al.add(new Student(35,"Riya","Mech",70));
		al.add(new Student(4,"Rahul","IT",75));
		al.add(new Student(50,"Pooja","ENTC",80));
		al.add(new Student(66,"Lina","Computer",85));
		al.add(new Student(78,"Tina","ENTC",70));
		al.add(new Student(80,"Mina","Mech",65));
		al.add(new Student(99,"Bharti","Computer",60));

		HashMap<String, Integer> hm= new HashMap<>();
		
		for(Student s: al)
		{
			if(hm.containsKey(s.dept))
			{
				int v=hm.get(s.dept)+1;
				hm.put(s.dept, v);
			}
			else
			{
				hm.put(s.dept, 1);
			}
			
		}
		System.out.println(hm);
	}

}
