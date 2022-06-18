package day1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//with 3rd variable
		//int t;
		  //t = a;
		  //a = b;
		  //b = t;
		  
		  //System.out.println("a :"+a);
		  //System.out.println("b :"+b);
		
	}

}
