package containment;

import java.util.ArrayList;

public class Employee {

	int eid,salary;
	String name;
	
	Employee(int eid,String name,int salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		
	}
	
	public String toString()
	{
		return eid+" "+name+" "+salary;
	}
}
