package containment;

import java.util.Arrays;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        DepartmentE dept[]=new DepartmentE[2];
        
        for(int i=0; i<2; i++)
        {
        	System.out.println("Enter dname,totalemp");
        	String dname=sc.next();
        	int totalemp=sc.nextInt();
        	
        Employee emp[]=new Employee[2];
        for(int j=0; j<2; j++)
        {
        	System.out.println("Enter the id,name,salary,contact,address of the "+(j+1)+"employee:");
        	int id=sc.nextInt();
        	String name=sc.next();
        	int salary=sc.nextInt();
        	String contact=sc.next();
        	String address=sc.next();
        	
        	Employee e1=new Employee();
        	e1.setId(id);
        	e1.setName(name);
        	e1.setSalary(salary);
        	e1.setContact(contact);
        	e1.setAddress(address);
        	
        	emp[j]=e1;
        }
        DepartmentE d1 = new DepartmentE();
        d1.setDname(dname);
        d1.setTotalemp(totalemp);
        d1.setEmp(emp);
        
        dept[i]=d1;
        }
        System.out.println(Arrays.toString(dept));
        for(DepartmentE d: dept)
        {
        for(Employee s:d.emp)
        {
        	if( s.getSalary()>50000)
        	{
        	   int cnt=s.getSalary()*15/100;
        	System.out.println(d.dname+" "+"Old salary "+s.getSalary()+" "+"New salary "+(s.getSalary()+cnt));
        	}
        }
	}

	}

}
