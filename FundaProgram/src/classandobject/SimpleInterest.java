package classandobject;

import java.util.Scanner;

public class SimpleInterest {
	
	int Interest(int p,int r,int t)
	{
		return p*r*t;
	}
	void print(int p1)
	{
		double si=p1/100;
		System.out.println("Simple interest is: "+si);
	}

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle,rate of interest,time: ");
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		SimpleInterest si = new SimpleInterest();
		int p1 = si.Interest(p, r, t);
		si.print(p1);
		System.out.println(si);
		sc.close();
	}

}
