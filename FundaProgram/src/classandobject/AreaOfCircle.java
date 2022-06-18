package classandobject;

import java.util.Scanner;

public class AreaOfCircle {
	int r;
	
	int rSquare(int r)
	{
		return r*r;
	}
	
	void area(int m)
	{
		//int r = rSquare(5);
		double area = 3.14*m;
		//double area = 3.14*sqr;
		System.out.println("Area of circle is: "+area);
	}
	void print(int m)
	{
		int n = m+100;
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle: ");
		int r = sc.nextInt();
		
		AreaOfCircle c1 = new AreaOfCircle();
		//int sqr=c1.rSquare(r);
		//c1.area(c1.rSquare(r));
		int m=c1.rSquare(r);
		c1.print(m);
		c1.area(m);//5
		
		System.out.println("Enter the radius of circle: ");
		r = sc.nextInt();
		AreaOfCircle c2 = new AreaOfCircle();
		//int sqr1=c2.rSquare(r);
		c2.area(r);
		sc.close();

	}

}
