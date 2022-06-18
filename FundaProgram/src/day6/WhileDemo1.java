package day6;

import java.util.Scanner;

public class WhileDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int i = sc.nextInt();
		
		while(i <= 5)
		{
			System.out.println(i+" ");
			i++;
		}
		//i++;
		System.out.println("Done");

	}

}
