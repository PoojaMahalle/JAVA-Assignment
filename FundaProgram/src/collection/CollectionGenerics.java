package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionGenerics {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		
		a1.add(10);
		a1.add(30);
		a1.add(40);
		a1.add(20);
		a1.add(50);
		a1.add(10);
		a1.add(30);
		a1.add(40);
		a1.add(20);
		a1.add(50);
		a1.add(10);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int cnt=0;
		int c=sc.nextInt();
	       for(int i=0; i<a1.size(); i++)
	       {
	    	   if(a1.get(i)==c)
	    	   {
	    		   cnt++;
	    	   }
	       } 
	      System.out.println("Number of count= "+cnt);
	      
//	      for(Integer i:a1)
//	      {
//	    	  if(c==i)
//	    	  {
//	    		  cnt++;
//	    	  }
//	      }
//         System.out.println("Number of count= "+cnt);
	}

}
