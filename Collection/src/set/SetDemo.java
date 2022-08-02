package set;

import java.util.HashSet;

public class SetDemo {
	
	 static void traverseSet(HashSet<Integer> hs)
	 {
		 for(Integer i: hs)
		 {
			 System.out.println(i);
		 }
	 }
	 
	 static void average(HashSet<Integer> hs)
	 {
		 float n = 0;
			
			for(Integer i: hs)
			{
				n = n+i;
			}
			System.out.println();
			float total=n/hs.size();
			System.out.println("Average: "+total);
	 }

	public static void main(String[] args) {

     HashSet<Integer> hs = new HashSet<>();
     
     hs.add(10);
     hs.add(80);
     hs.add(150);
     hs.add(900);
     hs.add(50);
     hs.add(10);
     hs.add(70);
     hs.add(900);
     hs.add(90);
     
     //System.out.println(hs);
     
     traverseSet(hs);
     average(hs);

	}

}
