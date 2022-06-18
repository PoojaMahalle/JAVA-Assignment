package day3;

import java.util.Scanner;

public class MaxNumBetween3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		
		if(a > b && a > c)
		{
			System.out.println("a is maximum number"+a);
		}
		else if(b > a && b > c)
		{
			System.out.println("b is maximum number"+b);
		}
		else
		{
			System.out.println("c is maximum number"+c);
		}

	}

}

//accept 2 number and read the choice 
