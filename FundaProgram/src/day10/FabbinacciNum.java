package day10;

import java.util.Scanner;

public class FabbinacciNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
         int r=sc.nextInt();
		 int a= 0, b = 1;
		
		 for(int i = 1; i <= r; i++)//i=2
		  {
			 for(int j=1; j<=i; j++)//j=1
			 {
		      
			  System.out.print(a+" ");
			  int c = a+b;     //c=1
			  a=b;             //a=1
			  b=c;            //c=1
		 }
			 System.out.println();
	}

}
}
