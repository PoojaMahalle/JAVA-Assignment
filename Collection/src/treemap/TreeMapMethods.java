package treemap;

import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {

      TreeMap<Integer, String> tm = new TreeMap<>();
      
      tm.put(1, "Riya");
      tm.put(67, "Rrrna");
      tm.put(101, "Rahul");
      tm.put(4, "Ramesh");
      tm.put(89, "Pooja");
      tm.put(34, "Nisha");
      tm.put(5, "Rohan");
      tm.put(20, "Ram");
      tm.put(78, "Raj");
      tm.put(11, "Sachin");
      tm.put(205, "Gaurav");
      tm.put(67, "Leena");
      tm.put(120, "Mira");
     // tm.put(105, "Mina");

      System.out.println(tm);
      
      System.out.println(tm.descendingMap());
      
      System.out.println(tm.ceilingKey(105));//it will key which is greater than or equal to 105
      System.out.println(tm.ceilingEntry(105));
      
      System.out.println(tm.floorKey(105));;//return key less than 105
      System.out.println(tm.floorEntry(105));
      
      System.out.println(tm.firstEntry());
      System.out.println(tm.firstKey());
      
      System.out.println("\n");
      
      System.out.println(tm);
      
      System.out.println(tm.tailMap(78, false));//start key
      
      System.out.println(tm.headMap(10));//end key
      
      System.out.println(tm.subMap(5, false, 105, true));
	}

}
