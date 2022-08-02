package vector;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(101, "ABC");
		ht.put(42, "DEF");
		ht.put(106, "GHI");
		ht.put(104, "KLM");
		ht.put(105, "NOP");
		ht.put(111, "QRS");
		ht.put(122, "TUV");
		ht.put(103, "WXY");
		ht.put(134, "STR");
		
		System.out.println(ht);
		
		//Enumeration e = ht.keys();
		Enumeration e = ht.elements();//fail safe iterator in enumeration
		while(e.hasMoreElements())
		{
			if(e.nextElement().equals(104))
			ht.put(100, "HGF");
			//System.out.println(e.nextElement());
		}
		System.out.println(ht);

	}

}
