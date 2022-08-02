package set;

import java.util.HashSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<>();
		
		hs.add(new Employee(101,"Raj","Sales",55000));
		hs.add(new Employee(120,"Ram","Development",90000));
		hs.add(new Employee(111,"Priya","Marketing",60000));
		hs.add(new Employee(121,"Lina","Sales",70000));
		hs.add(new Employee(102,"Shyam","Development",50000));
		hs.add(new Employee(108,"Riya","Marketing",55000));
		hs.add(new Employee(109,"Mina","Development",80000));
		
		System.out.println(hs);

	}

}
