package day5;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Rectangle \n 2.Circle \n 3.Triangle");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Enter the length");
		       int len = sc.nextInt();
		       System.out.println("Enter the breadth");
		       int b = sc.nextInt();
		       int area = len*b;
		       System.out.println(area);
		       break;
		case 2:System.out.println("Enter the radius");
		       int radius = sc.nextInt();
		       double PI=3.14;
		       double circleArea = PI*radius*radius;
		       System.out.println(circleArea);
		       break;
		case 3:System.out.println("Enter the base");
		       int base=sc.nextInt();
		       System.out.println("Enter the height");
		       int h = sc.nextInt();
		       double areaOfTriangle=0.5 * base * h;
		       System.out.println(areaOfTriangle);
		       break;
		       default:
		    	   System.out.println("Invalid choice");
		}

	}

}
