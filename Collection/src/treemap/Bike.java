package treemap;

public class Bike implements Comparable<Bike>{

	int id;
	String name,brand;
	
	Bike(int id,String name,String brand)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+brand;
	}
	
	public  int compareTo(Bike b)
	{
		//return this.id-b.id;
		return this.name.compareTo(b.name);
	}
}
