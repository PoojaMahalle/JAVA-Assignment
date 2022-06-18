package hirerchical;

import java.util.Scanner;

public class FatherMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter: name,surname,age,education");
        
        String name=sc.next();
        String surname=sc.next();
        int age=sc.nextInt();
        String education=sc.next();
        
        Son s1 = new Son();
        s1.setName(surname);
        s1.setSurname(surname);
        s1.setAge(age);
        s1.setEducation(education);
        System.out.println(s1);
        
        System.out.println("Enter: name,surname,age,education,vehical");
        name=sc.next();
        surname=sc.next();
        age=sc.nextInt();
        String vehical=sc.next();
        
        Daughter d1 = new Daughter();
        d1.setName(surname);
        d1.setSurname(surname);
        d1.setAge(age);
        d1.setVehical(vehical);
        System.out.println(d1);

	}

}
