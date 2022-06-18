package day9;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r;
		r = sc.nextInt();
		
		 for(int i=1; i<=r; i++) 
		 {
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print(j+"");
			 } 
			 for(int k=i-1; k>=1; k--)
			 {
				 System.out.print(k+"");
			 }
			 System.out.println();    
		 }
		 for(int i=r-1; i>=1; i--) 
		 {
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print(j+"");
			 } 
			 for(int k=i-1; k>=1; k--)
			 {
				 System.out.print(k+"");
			 }
			 System.out.println();    
		 }
             System.out.println("Done");


	}

}
