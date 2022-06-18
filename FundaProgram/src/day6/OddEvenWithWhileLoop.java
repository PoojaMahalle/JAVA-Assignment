package day6;

import java.util.Scanner;

public class OddEvenWithWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int i = 1;
		while (i <= num) {
			if (i % 2 == 0) {
				System.out.println("Even number = " + i);

			}
			i++;
		}
		while (i <= num) {
			if (i % 2 != 0) {
				System.out.println("Odd number = " + i);

			}
			i++;
		}
		sc.close();
	}

}
