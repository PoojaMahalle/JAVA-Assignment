package map;

public class Employee {
	
	String name,dept;
	int salary;
	
	Employee(String name,String dept,int salary)
	{
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public String toString()
	{
		return name+" "+dept+" "+salary;
	}

}
