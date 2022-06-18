package day6;

import java.util.Scanner;

public class PrimeNumberWithWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int i = 2, temp = num / 2; //3 mid
		
		while(i <= temp) //7 3 i=2 i=3 i=4
		{
			if(num % i == 0) // 7%2==0 7%3==0
			{
				break;
			}
			i++;
		}
		if(i > temp)
		{
			System.out.println("Is a prime number "+num);
		}
		else
		{
			System.out.println("Is not a prime number "+num);
		}

	}

}
