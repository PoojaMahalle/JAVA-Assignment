package day3;

import java.util.Scanner;

public class ChoiceCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		System.out.println("Press 1-Add 2-Sub 3-Multi 4-Div");
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Add="+(num1+num2));
			
		}
		else if(choice == 2)
		{
			System.out.println("Sub="+(num1-num2));
		}
		else if(choice == 3)
		{
			System.out.println("Multi="+(num1*num2));
		}
		else if(choice == 4)
		{
			System.out.println("Div="+(num1/num2));
		}
		else
		{
			System.out.println("Dont have choice");
		}

	}

}
