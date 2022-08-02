package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
//		HashMap<Integer, String> hm=new HashMap<>();////random output
//		hm.put(101, "ABC");
//		hm.put(102, "DEF");
//		hm.put(103, "ABC");
//		hm.put(104, "GHI");
//		hm.put(115, "JKL");
//		hm.put(106, "MNO");
//		hm.put(107, "ABC");
//		hm.put(118, "PQR");
//		hm.put(109, "ABC");
//		hm.put(110, "XYZ");
//		System.out.println(hm);
		
//		LinkedHashMap<Integer, String> hm1=new LinkedHashMap<>();//retain the order of inseration
//		hm1.put(101, "ABC");
//		hm1.put(102, "DEF");
//		hm1.put(103, "ABC");
//		hm1.put(104, "GHI");
//		hm1.put(105, "JKL");
//		hm1.put(106, "MNO");
//		hm1.put(107, "ABC");
//		hm1.put(108, "PQR");
//		hm1.put(109, "ABC");
//		hm1.put(110, "XYZ");
//		System.out.println(hm1);
		
		TreeMap<Integer, String> tm=new TreeMap<>();//ascending
		tm.put(101, "ABC");
		tm.put(102, "DEF");
		tm.put(103, "ABC");
		tm.put(114, "GHI");
		tm.put(105, "JKL");
		tm.put(106, "MNO");
		tm.put(117, "ABC");
		tm.put(108, "PQR");
		tm.put(109, "ABC");
		tm.put(111, "XYZ");
		System.out.println(tm);
		
		
		


	}

}
