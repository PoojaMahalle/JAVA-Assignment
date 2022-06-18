package day1;

import java.util.Scanner;

public class Equilateral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		if(side1==side2 && side2==side3 && side1==side3)
		{
			System.out.println("Equilateral triangle");
		}
		else
		{
			System.out.println("Not equilateral triangle");
		}
	}

}
