package map;

public class Employee1 {

	int id;
	String name,dept;
	
	Employee1(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		
	}
	
	public String tostring()
	{
		return id+" "+name+" "+dept;
	}
	
	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object o)
	{
		Employee1 e=(Employee1)o;
		if(this.id==e.id)
			return true;
		else
			return false;
	}
}
