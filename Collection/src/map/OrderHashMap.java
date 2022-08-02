package map;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderHashMap {

	public static void main(String[] args) {
		ArrayList<Order> al= new ArrayList<>();
		
		al.add(new Order(101,"Pune",50,"Delivered"));
		al.add(new Order(102,"Mumbai",10,"Pending"));
		al.add(new Order(103,"Pune",60,"Delivered"));
		al.add(new Order(104,"Pune",10,"Pending"));
		al.add(new Order(105,"Mumbai",20,"Pending"));
		al.add(new Order(106,"Nashik",30,"Delivered"));
		al.add(new Order(107,"Pune",20,"Delivered"));
		al.add(new Order(108,"Mumbai",50,"Pending"));
		al.add(new Order(109,"Nagpur",40,"Delivered"));
		al.add(new Order(110,"Nashik",30,"Pending"));
		//System.out.println(al);
		
		HashMap<String, Integer> hm= new HashMap<>();
		for(Order o: al)
		{
				if(o.status.equals("Pending"))
				{
					if(hm.containsKey(o.city))
					{
				      hm.put(o.city, hm.get(o.city)+1);
				    }
					else
					{
						hm.put(o.city, 1);
					}
			}
			
		}
		System.out.println(hm);
		

	}

}
