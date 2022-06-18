package day9;

import java.util.Scanner;

public class AlphabetPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r;
		char ch='A';
		r = sc.nextInt();
		
		 for(int i=0; i<=r; i++) //0
		 {                                                               
			 ch='A';
			 for(int a=r-i; a>=0; a--)//4 3
			 {
			 System.out.print(" ");
			 
			 }
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
