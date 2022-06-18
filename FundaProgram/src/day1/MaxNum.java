package day1;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2)
		{
			System.out.println(num1+" is the greater number");
		}
		else
		{
			System.out.println(num2+" is not greater number");
		}
	}

}
