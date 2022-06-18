package day9;

import java.util.Scanner;

public class NumberPattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r;
		r = sc.nextInt();
		
		 for(int i=1; i<=r; i++) 
		 {
			  for(int j=1; j<=(i*2)-1; j++)
			 {
				 System.out.print(j);
			 }
			  System.out.println();
		 }
		 for(int i=r-1; i>=1; i--)
		 {
			 for(int j=1; j<=(i*2)-1; j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		 
             System.out.println("Done");

	}

}
