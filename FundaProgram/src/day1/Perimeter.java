package day1;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int per = 2*(num+num1);
		System.out.println("Rectangle of Perimeter= "+per);
		

	}

}
