package a;

public class Test3 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
	      System.out.println(t1.a);
	    //System.out.println(t1.b); //private
	      System.out.println(t1.c);
	      System.out.println(t1.d);
	      t1.display();//default
	     //t1.display1();//private
	      t1.display2();//public
	      t1.display3();//protected

	}

}
