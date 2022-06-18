package abstractinjava;

public class SciCalculator implements Calculator {
	
	int a=10,b=20;
	public void add()
	{  
		int sum=a+b;
	   System.out.println("Addition = "+ sum);
	}
	
	public void substraction()
	{  
		int sub=a-b;
	   System.out.println("substraction = "+ sub);
	}
	
	public void multiplication()
	{  
		int multi=a*b;
	   System.out.println("multiplication = "+ multi);
	}

	public void division()
	{  
		int div=a/b;
	   System.out.println("division = "+ div);
	}
	
	void pow()
	{
		System.out.println("power of 2^3 = "+Math.pow(2, 3));
	}
	
	void square()
	{
		System.out.println("Square root of 49 = "+Math.sqrt(49));
	}
}
