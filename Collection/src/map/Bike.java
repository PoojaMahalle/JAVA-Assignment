package map;

public class Bike {

	int id;
	String name,color;
	
	Bike(int id,String name,String color)
	{
		this.id=id;
		this.name=name;
		this.color=color;
	}
	
	public String toString()
	{
		return id+" "+name+" "+color;
	}
}
