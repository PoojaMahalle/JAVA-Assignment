package map;

import java.util.ArrayList;
import java.util.HashMap;

public class WeekDaysArrayList {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<>();
		
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Monday");
		al.add("Tuesday");
		al.add("Sunday");
		al.add("Saturday");
		al.add("Sunday");
		al.add("Saturday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Monday");
		al.add("Saturday");
		
		HashMap<String, Integer> hm= new HashMap<>();
		for(String s: al)
		{
			if(hm.containsKey(s))
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
			
		}
		System.out.println(hm);

	}

}
