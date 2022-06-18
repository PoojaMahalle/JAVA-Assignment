package day1;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int cube = num * num * num;
        System.out.println("Number of cube = "+cube);
       
	}

}
