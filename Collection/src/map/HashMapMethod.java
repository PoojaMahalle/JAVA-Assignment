package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(101, "ABC");
		hm.put(102, "DEF");
		hm.put(103, "ABC");
		hm.put(104, "GHI");
		hm.put(115, "JKL");
		hm.put(106, "MNO");
		hm.put(107, "ABC");
		hm.put(118, "PQR");
		hm.put(109, "ABC");
		hm.put(110, "XYZ");
		System.out.println(hm);
		
		System.out.println(hm.isEmpty());
		System.out.println(hm.get(109));//value of the key
		System.out.println(hm.containsKey(110));//whether is present
		System.out.println(hm.containsValue("ABC"));
		
		System.out.println(hm.hashCode());
		
		hm.remove(101);
		System.out.println(hm);
		
//		hm.clear();
//		System.out.println(hm);
		
		System.out.println(hm.size());
		
		hm.replace(109, "DTG");
		System.out.println(hm);
		
		hm.put(101, "UVX");
		System.out.println(hm);
		
		////traversing map
		for(Integer i:hm.keySet())//display key set only
		{
			//System.out.println(i+" "+hm.get(i));
			System.out.println(i+" ");
		}
		System.out.println();
		for(String s:hm.values())//display value set only
		{
			//System.out.println(s+" "+hm.get(s));
			System.out.println(s+" ");
		}
		
		System.out.println();
		System.out.println("------Entery map-------");
		for(Map.Entry<Integer, String> entry: hm.entrySet())
       {
	    System.out.println(entry.getKey()+" "+entry.getValue());
       }
		
		System.out.println();
		System.out.println("------Iterator-------");
		
		//set s=hm.enterySet();
		//Iterator itr=s.iterator();
		
		Iterator itr = hm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println();
		
		System.out.println("------Iterator using map.entery-------");
		Iterator<Map.Entry<Integer, String>> itr1=hm.entrySet().iterator();
		while(itr1.hasNext())
		{
			Map.Entry<Integer, String> ent=itr1.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
			//System.out.println(itr1.next());
		}
	}

}
