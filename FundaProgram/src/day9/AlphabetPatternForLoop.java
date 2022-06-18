package day9;

import java.util.Scanner;

public class AlphabetPatternForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r;
		char ch='a';
		r = sc.nextInt();
		
		
		 for(int i=1; i<=r; i++) 
		 {
		
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print(ch+" ");
			 }                         
			 System.out.println();
		     ch++;
		 }
             System.out.println("Done");

	}

}
