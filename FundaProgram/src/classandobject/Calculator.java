package classandobject;

public class Calculator {
	
	int a,b; //accessible throughout the class
	
	void input(int a1, int b1) //a1=20 b1=30
	{
		a=a1;
		b=b1;
	}
      void add()
      {
    	  int a=10,b=20;
    	  System.out.println("Addition is: "+(a+b));
      }
      
      void substraction()
      {
    	  int a=30,b=20;
    	  System.out.println("Substraction is: "+(a-b));
      }
      
      void multiplication()
      {
    	  int a=10,b=20;
    	  System.out.println("Multiplication is: "+(a*b));
      }
      
      void division()
      {
    	  int a=50,b=20;
    	  System.out.println("Division is: "+(a/b));
      }
	public static void main(String[] args) {
		// 3 ways to set the values
		//1. assign value by reference
		//2.by method
		//3.by constructor
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator(); //a,b
		
		c1.input(20, 30); //application
		c1.add();
		c1.input(200, 300);
		c1.substraction();
		c1.multiplication();
		c1.division();
		
		c2.add();

	}

}
