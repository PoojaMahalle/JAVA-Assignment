package day3;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int percentage= sc.nextInt();
		
		if(percentage>=75)
		{
			System.out.println("You get distinction");
		}
		else if(percentage>=60)
		{
			System.out.println("You got first class");
		}
		else if(percentage>=50)
		{
			System.out.println("You got second class");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
