package containment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CompanyCarMain2 {

	public static void main(String[] args) {
		ArrayList<Company1> comp=new ArrayList<>();
		ArrayList<Car1> c=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: car size");
		int size=sc.nextInt();
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter: id,name");
			int comp_id=sc.nextInt();
			String comp_name=sc.next();
			
			 c=new ArrayList<>();
			for(int j=0; j<2; j++)
			{
				System.out.println("Enter Id,name,price,year");
				int id=sc.nextInt();
				String name=sc.next();
			    int price=sc.nextInt();
			    int year=sc.nextInt();
			    c.add(new Car1(id,name,price,year));
			}
			comp.add(new Company1(comp_id,comp_name,c));
		}
		System.out.println(comp);
		int year=0;
		for(Company1 com1: comp)
		{
		for(Car1 c1:com1.car)
		{
			if(c1.id==105)
				year=c1.year;
		}
		}
		
      Iterator<Company1> c1=comp.iterator();
		while(c1.hasNext())
		{
			Company1 cc = c1.next();
			Iterator<Car1> c2=cc.car.iterator();
			while(c2.hasNext())
			{
				Car1 a=c2.next();
				if(a.year==year)
				{
					c2.remove();
				}
			}
		
		}
      System.out.println(comp);


	}

}
