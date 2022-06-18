package day9;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r;
		r = sc.nextInt();
		
		 for(int i=1; i<=r; i++) //i=1 i=2
		 {
			 for(int j=1; j<=i; j++) //j=1 j=2 j=3
			 {
				 System.out.print("* ");//1
			 }                         //22
			 System.out.println();     //333
		 }
             System.out.println("Done");
	}

}
