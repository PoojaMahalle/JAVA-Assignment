package map;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemHashMap {

	public static void main(String[] args) {
         ArrayList<Item> al= new ArrayList<>();
		
        al.add(new Item(106,"Dairymilk","Cadburry",30));
		al.add(new Item(101,"Cofee","Nestle",50));
		al.add(new Item(102,"Biscuit","Parle",10));
		al.add(new Item(103,"Mariegold","Sunfeast",60));
		al.add(new Item(104,"Rusk","Britannia",10));
		al.add(new Item(106,"Dairymilk","Cadburry",30));
		al.add(new Item(107,"Maggie","Patanjali",20));
		al.add(new Item(130,"Biscuit","Parle",50));
		al.add(new Item(110,"Cofee","Nestle",50));
		al.add(new Item(181,"Dairymilk","Cadburry",50));
		
		HashMap<String, Integer> hm= new HashMap<>();
		for(Item i: al)
		{
				
					if(hm.containsKey(i.company))
					{
				      hm.put(i.company, hm.get(i.company)+1);
				    }
					else
					{
						hm.put(i.company, 1);
					}
			
		}
		System.out.println(hm);
		

	}

	}

