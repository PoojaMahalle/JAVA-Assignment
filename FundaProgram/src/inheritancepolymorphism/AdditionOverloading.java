package inheritancepolymorphism;

public class AdditionOverloading {
	
	void add(int a, int b)
	{
		System.out.println("addition of 2 numbers: "+(a+b));
	}

	void add(int a, int b, int c)
	{
		System.out.println("addition of 2 numbers: "+(a+b+c));
	}

	void add(float a, int b)
	{
		System.out.println("addition of 2 numbers(float,int): "+(a+b));
	}

	void add(float a, float b)
	{
		System.out.println("addition of 2 numbers(float,float): "+(a+b));
	}

	void add(String a, String b)
	{
		System.out.println("addition of 2 String: "+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionOverloading a1 = new AdditionOverloading();
		a1.add(10, 20);
		a1.add(10, 20, 30);
		a1.add(10f, 20);
		a1.add(10f, 20f);
		a1.add("ABC", "XYZ");

	}

}
