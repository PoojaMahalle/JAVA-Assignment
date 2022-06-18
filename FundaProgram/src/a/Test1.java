package a;

public class Test1 {

	int a=10;//default
	private int b=20;
	protected int c=30;
	public int d=40;

	void display()
	{
		System.out.println("In display method");
	}
	private void display1()
	{
		System.out.println("In display method");
	}
	public void display2()
	{
		System.out.println("In display method");
	}
	protected void display3()
	{
		System.out.println("In display method");
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.a);//same package
	      System.out.println(t1.b); //private
	      System.out.println(t1.c); //protected
	      System.out.println(t1.d);
	      
	      t1.display();
	      t1.display1();
	      t1.display2();
	      t1.display3();
		

	}

}
