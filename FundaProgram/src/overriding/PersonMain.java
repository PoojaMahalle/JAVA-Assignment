package overriding;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter: name,contact,address,id,percentage,dept");
        
        String name=sc.next();
        String contact=sc.next();
        String address=sc.next();
        int id=sc.nextInt();
        int percentage=sc.nextInt();
        String dept=sc.next();
        
        Student s1 = new Student();
        s1.setPersonData(name, contact, address);
        s1.setStudentData(id, percentage, dept);
      //  System.out.println(s1);
        s1.display();
        s1.grade();
        
        System.out.println("Enter: name,contact,address,id,salary,dept");
        name=sc.next();
        contact=sc.next();
        address=sc.next();
        int pf=sc.nextInt();
        int salary=sc.nextInt();
        
        Employee e1 = new Employee();
        e1.setPersonData(name, contact, address);
        e1.setEmployeeData(id, salary, pf, dept);
       // System.out.println(e1);
        e1.display();
        e1.pf();
        
        
        

	}

}
