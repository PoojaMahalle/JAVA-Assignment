package day10;

import java.util.Scanner;

public class BinaryPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
         int r=sc.nextInt();
         
         for(int i=1; i<=r; i++)
         {
        	 for(int j=0; j<r; j++)
        	 {
        		 System.out.print(((i+j)%2)+"");
        	 }
        	 System.out.println();
         }

	}

}
