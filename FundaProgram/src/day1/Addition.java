package day1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	    int sum = num1 + num2;
	    System.out.println("Addition of two numbers =" +sum);
	}

}
