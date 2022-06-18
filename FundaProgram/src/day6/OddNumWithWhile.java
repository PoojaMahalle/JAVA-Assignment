package day6;

import java.util.Scanner;

public class OddNumWithWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int i = 521;
		
		while(i >= 229)
		{
			if(i % 2 != 0)
			{
				System.out.println("Odd number " + i);
			}
			i--;
		}

	}

}
