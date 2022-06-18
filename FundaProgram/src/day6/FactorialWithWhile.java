package day6;

import java.util.Scanner;

public class FactorialWithWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int Factorial = sc.nextInt();
		int i = 1, num = 1;
		
		while(i <= Factorial)
		{
			num = num * i;
			i++;
		}
		System.out.println("Factorial of " + Factorial + " is " +num);

	}

}
