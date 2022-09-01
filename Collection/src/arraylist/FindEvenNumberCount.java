package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FindEvenNumberCount {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(34);
		al.add(89);
		al.add(2);
		al.add(90);
		
		System.out.println(al);
		int cnt=0;
		
		for(Integer i:al)
        {
        	if(i%2==0)
        	{
        		cnt++;
        		
        	}
        }
		System.out.println("Total count "+cnt);
        
	}

}
