package treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CarTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, Car> tm = new TreeMap<>();
		
		tm.put(101, new Car(2022,"Swift","Maroti",100000));
		tm.put(103, new Car(2020,"Swift","Maroti",250000));
		tm.put(104, new Car(2021,"Swift","Maroti",150000));
		tm.put(108, new Car(2010,"Swift","Maroti",120000));
		tm.put(120, new Car(2019,"Swift","Maroti",180000));
		tm.put(180, new Car(2015,"Swift","Maroti",200000));
		tm.put(125, new Car(2018,"Swift","Maroti",900000));
		tm.put(175, new Car(2016,"Swift","Maroti",100000));
		
		System.out.println(tm);
		
		for(Integer i:tm.keySet())
		{
			System.out.println(i+" ");
		}
		System.out.println();
		for(Car c: tm.values())
		{
			System.out.println(c+" ");
		}
		
		Iterator<Map.Entry<Integer, Car>> itr1=tm.entrySet().iterator();
		while(itr1.hasNext())
		{
			Map.Entry<Integer, Car> ent=itr1.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
		
		}

	}

}
