package day1;

import java.util.Scanner;

public class Denomation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount in rs");
		int amt = sc.nextInt();//12890
		
		int n2000 = amt/2000;
		amt = amt%2000; 
		
		int n500 = amt/500;
		amt = amt%500;
		
		int n200 = amt/200;
		amt = amt%200;
		
		System.out.println("Notes of 2000 ="+n2000);
		System.out.println("Notes of 500 ="+n500);
		System.out.println("Notes of 200 ="+n200);

	}

}
