package a;

public class Test2 extends Test1{

	public static void main(String[] args) {

      Test2 t2 = new Test2();
      System.out.println(t2.a);
     // System.out.println(t2.b); private
      System.out.println(t2.c);
      System.out.println(t2.d);
      t2.display();//default
    //  t2.display1();//private
      t2.display2();//public
      t2.display3();//protected

	}

}
