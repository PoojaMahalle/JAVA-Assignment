package day9;

import java.util.Scanner;

public class AlphabetPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r;
		char ch='a';
		r = sc.nextInt();
		
		
		 for(int i=1; i<=r; i++) 
		 {
			 ch='a';
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print(ch+" ");
				  ch++;
			 }                         
			 System.out.println();
		   
		 }
             System.out.println("Done");


	}

}
