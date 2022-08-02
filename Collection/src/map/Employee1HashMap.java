package map;

import java.util.HashMap;

public class Employee1HashMap {

	public static void main(String[] args) {
        HashMap<Employee1, Integer> hm=new HashMap<>();
		
		hm.put(new Employee1(101,"Raj","HR"),70000);
		hm.put(new Employee1(102,"Ram","Sales"),65000);
		hm.put(new Employee1(101,"Raj","HR"),70000);
		hm.put(new Employee1(103,"Rahul","Sales"),75000);
		hm.put(new Employee1(104,"Pooja","HR"),80000);

		System.out.println(hm);
	}

}
