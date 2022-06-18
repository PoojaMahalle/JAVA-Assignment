package day1;

import java.util.Scanner;

public class ThreeDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digits");
		int n = sc.nextInt();
		
		
		if(n>99 && n<1000)
		{
			System.out.println("Three digit number");
			System.out.println("Sum of three digits ");
			int last = n % 10;
			int two = n/10;
			int first = two/10;
			int mid = two%10;
			
			System.out.println(last+first+mid);
            
		}
		else
		{
			System.out.println("Not three digit number");
			
		}

	}

}
