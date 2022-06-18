package containment;

import java.util.Arrays;
import java.util.Scanner;

public class DeptStudMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        DepartmentGet dept[]=new DepartmentGet[2];
        
        
        for(int i=0; i<2; i++)
        {
        	System.out.println("Enter id,name,student list: of the department");
        	int did=sc.nextInt();
        	String dname=sc.next();
        	
        StudentGet stud[]=new StudentGet[2];
        for(int j=0; j<2; j++)
        {
        	System.out.println("Enter the id,name,marks,contact of the "+(j+1)+"student:");
        	int id=sc.nextInt();
        	String name=sc.next();
        	int marks=sc.nextInt();
        	String contact=sc.next();
        	
        	StudentGet s=new StudentGet();
        	s.setId(id);
        	s.setName(name);
        	s.setMarks(marks);
        	s.setContact(contact);
        	
        	stud[j]=s;
        }
        DepartmentGet d1 = new DepartmentGet();
        d1.setDid(did);
        d1.setDname(dname);
        d1.setStud(stud);
        
        dept[i]=d1;
        }
        System.out.println(Arrays.toString(dept));
        for(DepartmentGet d: dept)
        {
        for(StudentGet s:d.stud)
        {
        	if(s.marks>60)
        	{
        	System.out.println(d.dname+" "+s.name+""+s.marks);
        	}
        }
	}

	}

}
