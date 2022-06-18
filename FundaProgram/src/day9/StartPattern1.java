package day9;

import java.util.Scanner;

public class StartPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r;
		r = sc.nextInt();
		
		 for(int i=0; i<=r; i++) 
		 {
			 for(int j=1; j<=r-i; j++) 
			 {
				 System.out.print(" ");
			 } 
			 for(int a=0; a<=i; a++)
			 {
			 System.out.print("*"); 
			 }
			 System.out.println();
		 }
             System.out.println("Done");

	}

}
