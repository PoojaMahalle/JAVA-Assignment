package ioserializableinnerclass;

public class StaticOuter {
	
	static int a = 100;
	int b = 2000;
	
	static class Inner
	{
		static int a = 1000;//shadowing of variable
		//int ba=10;
		void display()
		{
			System.out.println("Inside static class display "+a);
			System.out.println(StaticOuter.a);
			StaticOuter so = new StaticOuter();
			System.out.println(so.b);
		}
	}

	public static void main(String[] args) {


		StaticOuter.Inner obj = new StaticOuter.Inner();
		obj.display();

	}

}
