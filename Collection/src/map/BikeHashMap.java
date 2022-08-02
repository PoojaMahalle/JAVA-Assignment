package map;

import java.util.HashMap;

public class BikeHashMap {

	public static void main(String[] args) {
		HashMap<Bike, Integer> hm = new HashMap<>();
		
		hm.put(new Bike(101,"Pulsor","Black"), 150000);
		hm.put(new Bike(104,"Activa5G","White"), 90000);
		hm.put(new Bike(103,"RoyalEnfield","Black"),170000);
		hm.put(new Bike(110,"Yamaha","Black"),90000);
		hm.put(new Bike(120,"TVS","Black"), 85000);
		hm.put(new Bike(105,"HondaShine","Black"), 150000);
		hm.put(new Bike(115,"HondaLivo","Black"),85000);
		hm.put(new Bike(178,"Dio","Black"),90000);
		hm.put(new Bike(190,"HondaHornet","Black"),85000);
		
		System.out.println(hm);

	}

}
