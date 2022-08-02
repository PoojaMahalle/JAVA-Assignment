package map;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListHashMapDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
        al.add(20);
        al.add(100);
        al.add(20);
        al.add(30);
        al.add(100);
        al.add(40);
        al.add(30);
        al.add(200);
        al.add(30);
        al.add(20);
        al.add(100);
        al.add(200);
        
        HashMap<Integer, Integer> hm= new HashMap<>();
        
        for(Integer i: al)
        {
        	if(hm.containsKey(i))
        	{
        		//int v=hm.get(i)+1;
        		//hm.put(i, v);//change the value
        		hm.put(i, hm.get(i)+1);
        		
        	}
        	else
        		hm.put(i, 1);
        }
        System.out.println(hm);
	}

}
