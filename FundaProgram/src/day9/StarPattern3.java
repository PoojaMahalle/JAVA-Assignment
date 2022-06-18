package day9;

import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int i,j;
		int r = sc.nextInt();
		
		 for(i=1; i<=r; i++) 
		 {
			 System.out.print("*");
			 for(j=1; j<=i; j++) 
			 {
				 System.out.print(j);
			 } 
			 for(j=i-1; j>=1; j--)
			 {
			 System.out.print(j);
			 }
			 System.out.print("*");
			 System.out.println();
		 }
		 for(i=r-1; i>=1; i--)
		 {
			 System.out.print("*");
			 for(j=1;j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 for(j=i-1; j>=1; j--)
			 {
				 System.out.print(j);
			 }
			 System.out.print("*");
			 System.out.println();
			 
		 }
             System.out.println("Done");

	}

}
