package day1;

import java.util.Scanner;

public class Even {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Marks");
	//int age = sc.nextInt();
	/*
	 * if(age>=18) { System.out.println("You are eligible for vote"); } else {
	 * System.out.println("You are not eligible for vote"); }
	 */
	int percentage = sc.nextInt();
	if(percentage > 50) 
	{
		System.out.println("Student is pass");
		
	}
	else
	{
		System.out.println("Student is fail");
	}
}
}
