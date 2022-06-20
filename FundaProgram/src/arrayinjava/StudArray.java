package arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class StudArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,marks;
		String name;
		
		Stud s1[]= new Stud[2];
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter: Id,name,marks");
			id=sc.nextInt();
			name=sc.next();
			marks=sc.nextInt();
			Stud s=new Stud(id,name,marks);
			s1[i]=s;
			
		}
		
		Stud s2[]= new Stud[2];
	//	System.out.println("Element Student details");
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter: Id,name,marks");
			id=sc.nextInt();
			name=sc.next();
			marks=sc.nextInt();
			Stud s=new Stud(id,name,marks);
			s2[i]=s;
			
		}
		
		int j=0;
		
		for(Stud st:s1)
		{
			for(Stud sd:s2)
			{
				if(st.id==sd.id && st.name.equals(sd.name) && st.marks==sd.marks)
				{
					j++;
				}
			}
		}
		Stud s3[]= new Stud[(s1.length+s2.length)-(j*2)];
		int b=0;
		for(Stud st:s1)
		{
			int k=0;
			for(Stud sd:s2)
			{
				if(st.id==sd.id && st.name.equals(sd.name) && st.marks==sd.marks)
				{
					k++;
				}
			}
			if(k==0)
			{
				s3[b]=st;
				b++;
				
			}
		}
		//b=0;
		for(Stud st:s2)
		{
			int k=0;
			for(Stud sd:s1)
			{
				if(st.id==sd.id && st.name.equals(sd.name) && st.marks==sd.marks)
				{
					k++;
				}
			}
			if(k==0)
			{
				s3[b]=st;
				b++;
				
			}
		}
		
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.toString(s3));

	}

}
