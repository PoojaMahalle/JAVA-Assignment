package day9;

import java.util.Scanner;

public class DigitPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r;
		r = sc.nextInt();
		
		 for(int i=1; i<=r; i++) 
		 {
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print(j+" ");
			 }                         
			 System.out.println();    
		 }
             System.out.println("Done");

	}

}
