package containment;

import java.util.Arrays;

public class Department {

	int id;
	String name;
	Student stud[];
	
	Department(int id,String name,Student stud[])
	{
		this.id=id;
		this.name=name;
		this.stud=stud;
	}
	
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(stud);
	}
	
}
