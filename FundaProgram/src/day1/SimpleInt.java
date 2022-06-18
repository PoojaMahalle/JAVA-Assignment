package day1;

import java.util.Scanner;

public class SimpleInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal,rate of intrest");
		int P = sc.nextInt();
		int N = sc.nextInt();
		int R = sc.nextInt();
		int SI = P*N*R/100;
		System.out.println("Simple Intrest="+SI);
		
		

	}

}
