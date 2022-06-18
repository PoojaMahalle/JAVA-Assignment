package abstractinjava;

public abstract class Bike {
	int price;
	String color,brand;
	
	void setBikeData(int price,String color,String brand)
	{
		this.price=price;
		this.color=color;
		this.brand=brand;

	}

	void display()
	{
		System.out.println(price+" "+color+" "+brand);
	}
	
	void wheelno()
	{
		System.out.println("Pulsor has 2 wheels");
	}
	void mirror()
	{
		System.out.println("Pulsor has 2 mirror");
	}
	
	abstract void gears();
	abstract void features();
	abstract void seatNo();
	abstract void discount();

}
