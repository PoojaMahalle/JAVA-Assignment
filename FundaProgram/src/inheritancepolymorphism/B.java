package inheritancepolymorphism;
final class A  //cannot be subclass or inherited
{
	//final int 100; //constant
	final void display() //child class cannot override final method
	{
		//a=1000;
		System.out.println("Inside display method A class");
	}
//}
//public class B extends A {
  
	//void display()
	{
		//a=200;
		//System.out.println("Inside display method B class "+a);
	}
}
