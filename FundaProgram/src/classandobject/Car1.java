package classandobject;

import java.util.Scanner;

public class Car1 {
	int id,price,installment,discount;
	String name,year,brandname,payment;
	
	void setData(int i,int p,String n,String y,String b,int in,String p1)
	{
		id=i;
		price=p;
		name=n;
		year=y;
		brandname=b;
		installment=in;
		payment=p1;
		
	}
	
	public String toString()
	{
		return id+" "+price+" "+name+" "+year+" "+brandname+" "+installment+" "+payment;
	}
	
	void discount()
	{
		if(payment.equals("cash") && installment==0)
		{
			double discount = price*40/100;
			System.out.println("The discount is "+discount);
		
		}
		else if(payment.equals("online")&& installment==1)
		{
			double discount= price*30/100;
			System.out.println("The discount is "+discount);
		}
		else if(installment==2)
		{
			double discount= price*20/100;
			System.out.println("The discount is "+discount);
		}
		else if(installment==3)
		{
			double discount= price*10/100;
			System.out.println("The discount is "+discount);
		}
		else
		{
			System.out.println("No discount");
		}
	}

	public static void main(String[] args) {
		int id,price,installment;
		String name,year,brandname,payment;
		Scanner sc=new Scanner(System.in);
		
		Car1 c1 = new Car1();
		System.out.println("Enter: id,price,name,year,brandname,paymentmode,installment");
		id=sc.nextInt();
		price=sc.nextInt();
		name=sc.next();
		year=sc.next();
		brandname=sc.next();
		payment=sc.next();
		installment=sc.nextInt();
	    c1.setData(id, price, name, year, brandname, installment, payment);
	    System.out.println(c1);
		c1.discount();
		
		Car1 c2 = new Car1();
		System.out.println("Enter: id,price,name,year,brandname,paymentmode,installment");
		id=sc.nextInt();
		price=sc.nextInt();
		name=sc.next();
		year=sc.next();
		brandname=sc.next();
		payment=sc.next();
		installment=sc.nextInt();
	    c2.setData(id, price, name, year, brandname, installment, payment);
	    System.out.println(c2);
		c2.discount();
		
		Car1 c3 = new Car1();
		System.out.println("Enter: id,price,name,year,brandname,paymentmode,installment");
		id=sc.nextInt();
		price=sc.nextInt();
		name=sc.next();
		year=sc.next();
		brandname=sc.next();
		payment=sc.next();
		installment=sc.nextInt();
	    c3.setData(id, price, name, year, brandname, installment, payment);
	    System.out.println(c3);
		c3.discount();
		

	}

}
