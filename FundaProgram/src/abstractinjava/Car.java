package abstractinjava;

public abstract class Car { 
	
	int price;
	String brand;
	
	void setData(int price,String brand)
	{
		this.price=price;
		this.brand=brand;
	}

	void wheelno()
	{
		System.out.println("4 wheels");
	}
	void gears()
	{
		System.out.println("5 gears");
	}
	
	abstract void noOfSeats();//override
	abstract void dashBoard();
	abstract void engine();
	abstract void wheelType();
}
