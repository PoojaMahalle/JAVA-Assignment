package day1;

import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("Addition of Two Numbers= "+sum);
		
		//Substraction
		int sub = num1 - num2;
		System.out.println("Substraction of Two Numbers= "+sub);
		
		//Multiplication
		int multi = num1 * num2;
		System.out.println("Multiplication of Two Numbers= "+multi);
		
		//Division
		int div = num1 / num2;
		System.out.println("Division of Two Numbers= "+div);
		
		//Mod
		int mod = num1 % num2;
		System.out.println("Mod of Two Numbers= "+mod);
	}

}
