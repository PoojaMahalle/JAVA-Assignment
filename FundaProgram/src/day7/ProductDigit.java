package day7;

import java.util.Scanner;

public class ProductDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num,digit;
		int product=1;
		num = sc.nextInt();
		while(num != 0)
		{
			digit = num % 10;
			num = num/10;
			product = product*digit;
		}
         System.out.println("Product of digits = "+product);
	}

}
