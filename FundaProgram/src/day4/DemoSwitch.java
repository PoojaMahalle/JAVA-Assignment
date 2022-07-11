package day4;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int a= sc.nextInt();
		int b= sc.nextInt();
        System.out.println("Press 1-Add 2-substraction 3-Multiplication 4-Division");
	    int choice = sc.nextInt();
        
        switch (choice) 
        {
        case 1: int sum = a+b;
                System.out.println("sum of two numbers= "+sum);
                break;
        case 2: int sub = a-b;
                System.out.println("Substraction of two numbers= "+sub);
                break;
        case 3: int multi = a*b;
                System.out.println("Multiplication of two numbers= "+multi);
                break;
        case 4: int div = a/b;
                System.out.println("Division of two numbers= "+div);
                break;
                default:System.out.println("Invalid choice");
        }
	}

}
