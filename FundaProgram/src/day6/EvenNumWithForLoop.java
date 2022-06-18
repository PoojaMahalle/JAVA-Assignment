package day6;

import java.util.Scanner;

public class EvenNumWithForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int i = 121;
		
		for(i = 121; i <= 229; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Even number " + i);
			}
		}
	}

}
