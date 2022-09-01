package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleBy3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(20);
		al.add(30);
		al.add(25);
		al.add(15);
		
		for(int i=0; i<al.size(); i++)
		{
			//al.add(sc.nextInt());
			if(al.get(i)%3==0)
			{
				System.out.println(al.get(i));
			}
		}

	}

}
