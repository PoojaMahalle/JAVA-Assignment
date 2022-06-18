package inheritancepolymorphism;

import java.util.Scanner;

public class MainCompanyCar {

	public static void main(String[] args) {
		int id, price,year;
		int c_id;
		String name, model;
		String cname;
		Car1 c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: id,name,model,price");
		
		id=sc.nextInt();
		name=sc.next();
		model=sc.next();
		price=sc.nextInt();
		
		//Car1 c1 = new Car1(id,name,price,model);
		Car1 c1 = new Car1();
		c1.setId(id);
		c1.setName(name);
		c1.setModel(model);
		c1.setPrice(price);
		
		//Company cn = new Company(id,year,name,c);
		//System.out.println(cn);
		System.out.println("Enter: c_id, cname, year");
		c_id=sc.nextInt();
		cname=sc.next();
		year=sc.nextInt();
		
		Company cn = new Company();
		cn.setC_id(c_id);
		cn.setCname(cname);
		cn.setYear(year);
		cn.setC(c1);
		System.out.println(cn);
		
		System.out.println("Enter: c_id, cname, year");
		c_id=sc.nextInt();
		cname=sc.next();
		year=sc.nextInt();
		
		Company cn1 = new Company();
		cn1.setC_id(c_id);
		cn1.setCname(cname);
		cn1.setYear(year);
		cn1.setC(c1);
		System.out.println(cn1);
		
		System.out.println("Enter: c_id, cname, year");
		c_id=sc.nextInt();
		cname=sc.next();
		year=sc.nextInt();
		
		Company cn2 = new Company();
		cn2.setC_id(c_id);
		cn2.setCname(cname);
		cn2.setYear(year);
		cn2.setC(c1);
		System.out.println(cn2);
		
		System.out.println("Enter: c_id, cname, year");
		c_id=sc.nextInt();
		cname=sc.next();
		year=sc.nextInt();
		
		Company cn3 = new Company();
		cn3.setC_id(c_id);
		cn3.setCname(cname);
		cn3.setYear(year);
		cn3.setC(c1);
		System.out.println(cn3);
		
		System.out.println("Enter: c_id, cname, year");
		c_id=sc.nextInt();
		cname=sc.next();
		year=sc.nextInt();
		
		Company cn4 = new Company();
		cn4.setC_id(c_id);
		cn4.setCname(cname);
		cn4.setYear(year);
		cn4.setC(c1);
		System.out.println(cn4);
	}

}
