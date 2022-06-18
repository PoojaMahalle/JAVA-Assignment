package overriding;

public class Car {

	int launchyear,price;
	String name,brand;
	
	void setCarData(String name,String brand,int launchyear,int price)
	{
		this.name=name;
		this.brand=brand;
		this.launchyear=launchyear;
		this.price=price;
	}
	
	void display()
	{
		System.out.println(name+" "+brand+" "+launchyear+" "+price);
	}
}
