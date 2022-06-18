package day7;

import java.util.Scanner;

public class AdditionOfOdd {

	public static void main(String[] args) {
		
		int num=0;
		for(int i=1; i<=10; i++)
		{
			if(i % 2 != 0)
			{
				num = num + i;
			}
			
		}
		System.out.println("Sum of odd numbers " + num);

	}

}
