package ioserializableinnerclass;

public class MemberOuter {
	
	static int a = 1000;
	private int b = 10;
	int c = 100;
	
	class Inner
	{
		int a = 100;
		//final static int b = 1000;
		void display()
		{
			System.out.println("Inside member inner class");
			System.out.println(a+" "+b+" "+c);
			
			System.out.println(MemberOuter.this.a);
		}
	}

	public static void main(String[] args) {


		//MemberOuter outer = new MemberOuter();
		MemberOuter.Inner inner= new MemberOuter().new Inner();
		inner.display();

	}

}
