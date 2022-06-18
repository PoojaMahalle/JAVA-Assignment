package day1;

import java.util.Scanner;

public class Divisible7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		
		if(n % 7 == 0 || n % 10 == 7) 
		{
			System.out.println("Buzz number");
		}
		else
		{
			System.out.println("Not Buzz number");
		}

	}

}
