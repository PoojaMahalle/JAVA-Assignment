package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyCarMain {

	public static void main(String[] args) {
		ArrayList<Company> comp=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: car size");
		int size=sc.nextInt();
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter: id,name");
			int comp_id=sc.nextInt();
			String comp_name=sc.next();
			
			ArrayList<Car> c=new ArrayList<>();
			for(int j=0; j<2; j++)
			{
				System.out.println("Enter Id,name,price,year");
				int id=sc.nextInt();
				String name=sc.next();
			    int price=sc.nextInt();
			    int year=sc.nextInt();
			    c.add(new Car(id,name,price,year));
			}
			comp.add(new Company(comp_id,comp_name,c));
		}
		System.out.println(comp);
		
		for(Company c: comp)
		{
			for(Car e: c.car)
			{
				if(e.year>=2000 && e.price>=600000)
					System.out.println(e.name+" "+e.price+" "+e.year);
			}
		}


	}

}
