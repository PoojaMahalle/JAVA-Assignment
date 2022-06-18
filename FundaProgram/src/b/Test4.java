package b;

import a.Test1;

public class Test4 extends Test1{

	public static void main(String[] args) {
		Test4 t4 = new Test4();
		//System.out.println(t4.a);//same package
	     // System.out.println(t4.b); //private
	      System.out.println(t4.c); //
	      System.out.println(t4.d);
	      t4.display3();//protected
	     // t4.display();//default
	      //t4.display1();//private
	      t4.display2();//public

	}

}
