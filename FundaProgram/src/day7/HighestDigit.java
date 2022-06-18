package day7;

import java.util.Scanner;

public class HighestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		int num =sc.nextInt();
		int r,sum=0;
		
		r = num % 10;
		while(num != 0)
		{
			if(sum < r)
			{
				sum=r;
			}
			num = num / 10;
		}
         System.out.println("Highest digit is: "+ sum);
	}

}
