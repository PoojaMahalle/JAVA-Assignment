package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable {

	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(1,"Raj","HR",60000));
		al.add(new Employee(12,"Ram","HR",60000));
		al.add(new Employee(3,"Riya","HR",60000));
		al.add(new Employee(10,"Rahul","HR",60000));
		al.add(new Employee(4,"Pooja","HR",60000));
		al.add(new Employee(35,"Lina","HR",60000));
		al.add(new Employee(5,"Tina","HR",60000));
		al.add(new Employee(58,"Mina","HR",60000));
		al.add(new Employee(6,"Bharti","HR",60000));
		
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);

	}

}
