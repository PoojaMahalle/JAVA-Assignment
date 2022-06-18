package day1;

import java.util.Scanner;

public class TwoDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		
		
		if(n>=10 && n<=99)
		{	
			System.out.println("Two digit number "+n);
			
			
		}
		else
		{
			System.out.println("Not two digit number"+n);
			
		}

	}

}
