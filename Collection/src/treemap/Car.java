package treemap;

public class Car {
	
	int id,price,year;
	String name,brand;
	
	Car(int id,String name,String brand,int price)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	
	public String toString()
	{
		return id+" "+name+" "+brand+" "+price;
	}

}
