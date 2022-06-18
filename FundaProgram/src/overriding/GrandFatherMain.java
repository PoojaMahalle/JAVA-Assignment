package overriding;

import java.util.Scanner;

public class GrandFatherMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter: name,mname,lname");
        
        String name=sc.next();
        String mname=sc.next();
        String lname=sc.next();
        
        Son s1 = new Son();
        s1.setGrandFatherData(name, mname, lname);
      
        System.out.println("Enter: fname");
        String fname=sc.next();
        s1.setFatherData(fname);
        
        System.out.println("Enter: sname");
        String sname=sc.next();
        s1.setSonData(sname);
       
        s1.display();
        
//        Son s1 = new Son();
//        s1.setGrandFatherData("Ramesh", "Govindrao", "Raut");
//        s1.setFatherData("Sunil");
//        s1.setSonData("Ram");
//        s1.display();
	}

}
