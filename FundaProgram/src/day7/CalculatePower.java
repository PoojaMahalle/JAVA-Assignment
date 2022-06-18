package day7;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		//int n,power;
		int result=1;
		int n=sc.nextInt();
		
		System.out.println("Enter power");
		int power=sc.nextInt();
		
		for(int i=1; i<=power; i++)
		{
			result=n*result;
		}
        System.out.println("Power = "+result);
	}

}
