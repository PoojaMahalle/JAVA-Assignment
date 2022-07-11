package overriding;

public class CovarientReturnType {
	class A
	{
		A display()//Number display() Integer,float,byte,double,short,long
		{
			return new A();
		}
	}
	
	class B extends A
	{
		B display() //Float display()
		{
			return new B();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
