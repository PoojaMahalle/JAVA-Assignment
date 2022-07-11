package collection;

import java.util.ArrayList;

public class Department {

	int id;
	String dname;
	ArrayList<Employee> emp;
	
	Department(int id,String dname,ArrayList<Employee> emp)
	{
		this.id=id;
		this.dname=dname;
		this.emp=emp;
		
	}
	
	public String toString()
	{
		return id+" "+dname+" "+emp;
	}
}
