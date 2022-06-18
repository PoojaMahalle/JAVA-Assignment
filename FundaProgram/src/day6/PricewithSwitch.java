package day6;

import java.util.Scanner;

public class PricewithSwitch {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the menu");
		//int choice = sc.nextInt();
		
		int choice;
		char c = 'n';
		do
		{
	    System.out.println("1. Maharashtrian thali");
	    System.out.println("2. Gujrati thali");
	    System.out.println("3. West bengol thali");
	    System.out.println("4. Rajasthan thali");
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		 switch (choice) 
	        {
	        case 1: 
	                System.out.println("Maharashtrian thali");
	                System.out.println("Quantity");
	                int th = sc.nextInt();
	                int sum = th * 250;
	                System.out.println("sum of quantity " + sum);
	                break;
	        case 2: 
	                System.out.println("Gujrati thali");
	                System.out.println("Quantity");
	                int th1 = sc.nextInt();
	                int sum1 = th1 * 200;
	                System.out.println("sum of quantity " + sum1);
	                break;
	        case 3: 
	                System.out.println("West bengol thali");
	                System.out.println("Quantity");
	                int th2 = sc.nextInt();
	                int sum2 = th2 * 450;
	                System.out.println("sum of quantity " + sum2);
	                break;
	        case 4: 
	                System.out.println("Rajasthan thali");
	                System.out.println("Quantity");
	                int th3 = sc.nextInt();
	                int sum3 = th3 * 300;
	                System.out.println("sum of quantity " + sum3);
	                break;
	                default:System.out.println("Invalid choice");
	        }
		           System.out.println("Do you want to continue: (y/n): ");
			      c = sc.next().charAt(0);
			
			      }while(c=='y'||c=='Y');

	             System.out.println("Done");
}
}
