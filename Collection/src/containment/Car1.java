package containment;

public class Car1 {
	
	int id,price,year;
	String name;
	
	Car1(int id,String name,int price,int year)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.year=year;
	}
	
	public String toString()
	{
		return id+" "+name+" "+price+" "+year;
	}

}
