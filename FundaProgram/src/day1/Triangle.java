package day1;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers");
		
		int Base = sc.nextInt();
	    int Height = sc.nextInt();

	    int area = (Base * Height) / 2;
	    System.out.println("Area of triangle ="+area);
	}
	
}

