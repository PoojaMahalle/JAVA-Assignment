package treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Bike1TreeMap {

	public static void main(String[] args) {
       // TreeMap<Bike1, Integer> tm = new TreeMap<>(new Bike1NameComparator());
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(86, "Ram");
		hm.put(55, "riya");
		hm.put(60, "Mina");
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(71, "Shyam");
		hm1.put(54, "Priya");
		
		TreeMap<Integer, HashMap<Integer, String>> tm = new TreeMap<>();
		tm.put(1, hm);
		tm.put(2, hm1);
		System.out.println(tm);
		
		for(Map.Entry<Integer, HashMap<Integer, String>> ent: tm.entrySet())
		{
			System.out.println(ent.getKey());
			for(Map.Entry<Integer, String> hent:ent.getValue().entrySet())
			{
				System.out.println(hent.getKey()+" "+hent.getValue());
			}
			
		}
		
		Iterator itr = tm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		tm.put(new Bike1(101,"Pulsor","Bajaj"), 150000);
//		tm.put(new Bike1(104,"Activa5G","Honda"), 90000);
//		tm.put(new Bike1(103,"RoyalEnfield","Himalayan"),170000);
//		tm.put(new Bike1(120,"TVSScooty","TVS"), 85000);
//		tm.put(new Bike1(105,"HondaShine","Honda"), 150000);
//		tm.put(new Bike1(178,"Dio","Honda"),90000);
//		tm.put(new Bike1(190,"HondaHornet","Honda"),85000);
//		tm.put(new Bike1(101,"Pulsor","Bajaj"), 150000);
		
//		System.out.println(tm);

	}

}
