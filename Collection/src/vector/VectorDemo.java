package vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {


		Vector<Integer> v = new Vector<>();
		
		v.add(10);
		v.add(100);
		v.add(70);
		v.add(60);
		v.add(900);
		v.add(345);
		v.add(1);
		v.add(650);
		v.add(40);
		v.add(330);
		
		Enumeration<Integer> e= v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
