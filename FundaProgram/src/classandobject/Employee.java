package classandobject;

import java.util.Scanner;

public class Employee {
	int id,salary;
	String name,dept,designation,rating;
	
	
	void setData(int i,String n,String d,int s,String d1,String r)
	{
		id=i;
		name=n;
		dept=d;
		salary=s;
		designation=d1;
		rating=r;
	}
	
	public String toString() {
		return id+" "+name+" "+dept+" "+salary+" "+designation+" "+rating;
	}
	
	
	void bonus()
	{
		if(rating.equals("A"))
		{
			salary=salary + salary*15/100;
			System.out.println("Bonus "+salary);
		}
		else if(rating.equals("B"))
		{
			salary=salary + salary*10/100;
			System.out.println("Bonus "+salary);
		}
		else if(rating.equals("C"))
		{
			salary=salary + salary*5/100;
			System.out.println("Bonus "+salary);
		}
		else if(rating.equals("B"))
		{
			System.out.println("No Bonus ");
		}
			
	}
	public static void main(String[] args) {
		int id,salary;
		String name,dept,designation,rating;
		Scanner sc=new Scanner(System.in);

				
		Employee e1 = new Employee();
		
		System.out.println("Enter employee details: ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		salary=sc.nextInt();
		designation=sc.next();
		rating=sc.next();
		e1.setData(id, name, dept, salary, designation, rating);
		//System.out.println(e1);
		//e1.bonus();
        
		Employee e2 = new Employee();
		
		System.out.println("Enter employee details: ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		salary=sc.nextInt();
		designation=sc.next();
		rating=sc.next();
		e2.setData(id, name, dept, salary, designation, rating);
		//System.out.println(e2);
		//e2.bonus();
        
		Employee e3 = new Employee();
		
		System.out.println("Enter employee details: ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		salary=sc.nextInt();
		designation=sc.next();
		rating=sc.next();
		e3.setData(id, name, dept, salary, designation, rating);
		//System.out.println(e3);
		//e3.bonus();
        
		Employee e4 = new Employee();
		
		System.out.println("Enter employee details: ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		salary=sc.nextInt();
		designation=sc.next();
		rating=sc.next();
		e4.setData(id, name, dept, salary, designation, rating);
		//System.out.println(e4);
		//e4.bonus();
        
		Employee e5 = new Employee();
		
		System.out.println("Enter employee details: ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		salary=sc.nextInt();
		designation=sc.next();
		rating=sc.next();
		e5.setData(id, name, dept, salary, designation, rating);
		//System.out.println(e5);
		//e5.bonus();
		
		System.out.println(e1);
		e1.bonus();
		
		System.out.println(e2);
		e2.bonus();
		
		System.out.println(e3);
		e3.bonus();
		
		System.out.println(e4);
		e4.bonus();
		
		System.out.println(e5);
		e5.bonus();
	}

}
