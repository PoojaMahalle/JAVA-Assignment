package b;

import a.Test1;

public class Test5 {
	
	public static void main(String[] args) {
           
		Test1 t1 = new Test1();
		//System.out.println(t1.a);//same package
	      //System.out.println(t1.b); //private
	      //System.out.println(t1.c); //protected
	      System.out.println(t1.d);
	      t1.display2();//public
	      //t1.display1();//private
	      //t1.display3();//protected
	      //t1.display();//default
        

	}

}
