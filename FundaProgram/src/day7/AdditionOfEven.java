package day7;

import java.util.Scanner;

public class AdditionOfEven {

	public static void main(String[] args) {
		
		int num=0;
		int num1=0;
		for(int i=1; i<=10; i++)
		{
			if(i % 2 == 0)
			{
				num = num + i;
			}
			
			if(i % 2 != 0)
			{
				num1 = num1 + i;
			}
			
		}

		System.out.println("Sum of even numbers " + num);
		System.out.println("Sum of odd numbers " + num1);
	}

}
