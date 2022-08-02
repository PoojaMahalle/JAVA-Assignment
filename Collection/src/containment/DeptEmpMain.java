package containment;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptEmpMain {

	public static void main(String[] args) {
		ArrayList<Department> dept=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: size");
		int size=sc.nextInt();
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter: id,name,dept");
			int id=sc.nextInt();
			String dname=sc.next();
			
			ArrayList<Employee> emp=new ArrayList<>();
			for(int j=0; j<2; j++)
			{
				System.out.println("Enter Id,name,salary");
				int eid=sc.nextInt();
				String name=sc.next();
			    int salary=sc.nextInt();
			    emp.add(new Employee(id,name,salary));
			}
			dept.add(new Department(id,dname,emp));
		}
		System.out.println(dept);
		
		for(Department d: dept)
		{
			for(Employee e: d.emp)
			{
				if(e.salary>=60000)
					System.out.println(e.name+" "+e.salary+" "+d.dname);
			}
		}

	}

}
