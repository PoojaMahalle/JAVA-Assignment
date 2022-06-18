package day9;

import java.util.Scanner;

public class AlphabetPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r;
		char ch='A';
		r = sc.nextInt();
		
		 for(int i=r-1; i>=0; i--) 
		 {
			 for(int j=0; j<=i; j++) 
			 {
				 System.out.print("A"+" ");
				
			 }                         
			 System.out.println(); 
			
			
		 }
             System.out.println("Done");

	}

}
