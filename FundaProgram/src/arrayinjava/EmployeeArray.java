package arrayinjava;

import java.util.Scanner;

public class EmployeeArray {

	public static void main(String[] args) {
		int id,salary;
	    String name,dept,location;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		Employee empl[] = new Employee[size];
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter "+(i+1)+" Employee details: ");
			System.out.println("Enter employee id: ");
			id = sc.nextInt();
			System.out.println("Enter employee  name: ");
			name=sc.next();
			System.out.println("Enter employee  salary: ");
			salary=sc.nextInt();
			System.out.println("Enter employee  dept: ");
			dept=sc.next();
			System.out.println("Enter employee  location: ");
			location=sc.next();
			
			//empl[i]= new Employee(id,name,salary,dept,location);
			
			Employee e = new Employee();
			e.setId(id);
			e.setName(name);
			e.setSalary(salary);
			e.setDept(dept);
			e.setLocation(location);
			
			empl[i]=e;
			//e.print();
			
		}
		for(Employee e:empl)
		{
			if(e.getDept().equals("HR")&& e.getSalary()>30000)
			{
			System.out.println(e);
			}
	}

	}

}
