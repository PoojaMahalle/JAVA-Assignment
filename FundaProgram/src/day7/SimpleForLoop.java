package day7;

import java.util.Scanner;

public class SimpleForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(" " + i);
		}
          System.out.println("Done");
	}

}
