package day3;

import java.util.Scanner;

public class ThreeDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digits");
		int n = sc.nextInt();
		
		
		if(n>99 && n<1000)
		{
			System.out.println("Three digit number");
			int last = n % 10;
			int two = n/10;
			int first = two/10;
			int mid = two%10;
			int sum = last+mid+first;
			System.out.println(last+first+mid);
			
			
			if(n == sum)
			{
				System.out.println("Armstrong number"+n);
			}
			else
			{
				System.out.println("Not a armstrong number"+n);
			}
		}
		else
		{
			System.out.println("Not a three digit number");
			
		}


	}

}
