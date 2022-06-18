package day1;

import java.util.Scanner;

public class SumOfTwoDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digits");
		int n = sc.nextInt();
		
		
		if(n>=10 && n<=99)
		{
			int l = n%10;
			int f = n/10;
			int sum = l+f;
			System.out.println("Two digit number");
			System.out.println("Sum of two digits " +sum);
		}
		else
		{
			
			System.out.println("Not two digit number");
		}

	}

}
