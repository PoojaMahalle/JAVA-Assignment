package day9;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int r = sc.nextInt();
		
		for(int i=r; i>=1; i--)
		{
			for(int j=r; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=i; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
