package abstractinjava;

public class Fortuner extends Car {

	void noOfSeats()
	{
		System.out.println("Innova has 7 seats");
	}
	void dashBoard()
	{
		System.out.println("Music system,charging,meter");
	}
	void engine()
	{
		System.out.println("2800 cc");
	}
	void wheelType()
	{
		System.out.println("Fortuner has Aloy wheels");
	}
	public String toString()
	{
		return "Fortuner"+" "+brand+" "+price;
	}
}
