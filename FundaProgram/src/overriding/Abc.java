package overriding;

public class Abc {
	Abc()
	{
		System.out.println("In default constructor");
	}
	
	Abc(int a)
	{
		this();
		System.out.println("In single parameter constructor "+a);
	}
	Abc(int a, int b)
	{
		this(100);
		System.out.println(a+"In 2 parameter constructor "+b);
	}
	Abc(int a,int b,int c)
	{
		this(100,200);
		System.out.println(a+" In 3 parameter constructor"+b+" "+c);
	}

	public static void main(String[] args) {
		Abc a = new Abc(110,20,30);

	}

}
