package treemap;

import java.util.TreeMap;

public class BikeTreeMap {

	public static void main(String[] args) {
		TreeMap<Bike, Integer> tm = new TreeMap<>();
		
		tm.put(new Bike(101,"Pulsor","Bajaj"), 150000);
		tm.put(new Bike(104,"Activa5G","Honda"), 90000);
		tm.put(new Bike(103,"RoyalEnfield","Himalayan"),170000);
		tm.put(new Bike(120,"TVSScooty","TVS"), 85000);
		tm.put(new Bike(105,"HondaShine","Honda"), 150000);
		tm.put(new Bike(178,"Dio","Honda"),90000);
		tm.put(new Bike(190,"HondaHornet","Honda"),85000);
		tm.put(new Bike(101,"Pulsor","Bajaj"), 150000);
		
		System.out.println(tm);
		
		//System.out.println(tm.containsKey(new Bike(190,"HondaHornet","Honda")));

	}

}
