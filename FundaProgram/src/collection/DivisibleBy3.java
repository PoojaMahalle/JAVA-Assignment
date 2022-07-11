package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleBy3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<9; i++)
		{
			al.add(sc.nextInt());
			if(al.get(i)%3==0)
			{
				System.out.println(al.get(i));
			}
		}

	}

}
