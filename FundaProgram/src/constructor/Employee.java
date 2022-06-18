package constructor;

import java.util.Scanner;

public class Employee {

	int id,salary;
	String firstname,lastname,dept,designation;
	
	Employee(){}
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	int getSalary()
	{
		return salary;
	}
	void setFirstName(String firstname)
	{
		this.firstname=firstname;
	}
	String getFirstName()
	{
		return firstname;
	}
	
	void setLastName(String lastname)
	{
		this.lastname=lastname;
	}
	String getLastName()
	{
		return lastname;
	}
	
	void setDept(String dept)
	{
		this.dept=dept;
	}
	String getDept()
	{
		return dept;
	}
	
	void setDesignation(String designation)
	{
		this.designation=designation;
	}
	String getDesignation()
	{
		return designation;
	}
	public String toString()
	{
		return id+" "+salary+" "+firstname+" "+lastname+" "+dept+" "+designation;
	}
	
	
	public static void main(String[] args) {
		int id,salary;
		String firstname,lastname,dept,designation;
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		System.out.println("Enter: id,salary,firstname,lastname,dept,designation");
		id=sc.nextInt();
		salary=sc.nextInt();
		firstname=sc.next();
		lastname=sc.next();
		dept=sc.next();
		designation=sc.next();
		
		e1.setId(id);
		e1.setSalary(salary);
		e1.setFirstName(firstname);
		e1.setLastName(lastname);
		e1.setDept(dept);
		e1.setDesignation(designation);
		
		System.out.println(e1);
		

	}

}
