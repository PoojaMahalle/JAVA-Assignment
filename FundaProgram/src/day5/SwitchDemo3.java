package day5;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		String input = sc.next();

		switch (input) {
		case "happy":
			System.out.println("Happy");
			break;
		case "new":
			System.out.println("New");
			break;
		case "year":
			System.out.println("Year");
			break;
		default:
			System.out.println("Welcome");

		}

	}

}
