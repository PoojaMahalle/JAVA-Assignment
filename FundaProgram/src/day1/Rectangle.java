package day1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int area = length * breadth;
		System.out.println("Area of rectangle: "+area);
		
        
	}

}
