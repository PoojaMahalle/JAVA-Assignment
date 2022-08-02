package map;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

	public static void main(String[] args) {
		HashMap<Integer, Employee> hm=new HashMap<>();
		
		hm.put(1, new Employee("Shyam","HR", 90000));
		hm.put(2, new Employee("Ram","Sales",65000));
		hm.put(3, new Employee("Riya","Marketing",70000));
		hm.put(4, new Employee("Rahul","Sales",75000));
		hm.put(5, new Employee("Pooja","HR",80000));
		hm.put(6, new Employee("Lina","Sales",85000));
		hm.put(7, new Employee("Tina","HR",70000));
		hm.put(8, new Employee("Mina","Sales",65000));
		hm.put(9, new Employee("Bharti","HR",60000));
		
		//System.out.println(hm);
		
		for(Map.Entry<Integer, Employee> ent: hm.entrySet())
		{
			//System.out.println(ent.getKey()+" "+ent.getValue());//toString
			if(ent.getValue().dept.equalsIgnoreCase("HR"))
			System.out.println(ent.getKey()+" "+ent.getValue().name+" "+ent.getValue().dept);
		}
	}

}
