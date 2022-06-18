package day9;

import java.util.Scanner;

public class OppositeStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r;
		r = sc.nextInt();
		
		 for(int i=r-1; i>=0; i--) 
		 {
			 for(int j=0; j<=i; j++) 
			 {
				 System.out.print("*" + " ");
			 }                         
			 System.out.println();    
		 }
             System.out.println("Done");

	}

}
