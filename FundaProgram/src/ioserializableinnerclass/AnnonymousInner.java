package ioserializableinnerclass;

abstract class Person
{
	abstract void display();
}

interface A
{
	void show();
}


public class AnnonymousInner {
	
	public static void main(String[] args) {


		 Person p = new Person()
		{
			 String name="Abc";
			 void display()
			 {
				 System.out.println("Inside annonymous inner class");
				 System.out.println(name);
			 }
		};
		p.display();
		
		A a = new A()
		{
		public void show()
		{
			System.out.println("Interface overriden method");
		}
		};
		a.show();

	}

}

