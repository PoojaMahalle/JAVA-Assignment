package overriding;


	class Fruit
	{
		void eat()
		{
			System.out.println("Fruit are good for health");
		}
	}
	class Apple extends Fruit
	{
		void eat()
		{
			System.out.println("Apple are every good for eye");
		}
	}
	
	class Strawberry extends Fruit
	{
		void eat()
		{
			System.out.println("Strawberries are sweet in taste");
		}
	}
	
  public class FruitMain {
	  
	public static void main(String[] args) {
		Apple a1=new Apple();
		a1.eat();
		
		Fruit f1 = new Fruit();
		f1.eat();
		
		f1= new Apple();
		f1.eat();
		
		f1= new Strawberry();
		f1.eat();
		
	}

		}


