package classandobject;

public class Car {
	void wheelNo()
	{
		System.out.println("4 wheels");
	}
	
	void dashBoard()
	{
		System.out.println("Compulsory for each car");
	}
    
	void engineCapacity()
	{
		System.out.println("Average engine capacity: 1100 cc");
	}
	
	void milage()
	{
		System.out.println("milage: 20km/ltr");
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		System.out.println("First Car");
		c1.engineCapacity();
		
		System.out.println("Second Car");
		c2.engineCapacity();
		c2.milage();
		c2.dashBoard();
		
		System.out.println("Third Car");
		c3.dashBoard();

	}

}
