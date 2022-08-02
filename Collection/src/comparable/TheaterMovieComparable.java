package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TheaterMovieComparable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Theater size: ");
		ArrayList<Theater> t= new ArrayList<>();
		
		int size=sc.nextInt();
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter: id,name");
			int id=sc.nextInt();
			String name=sc.next();
			
			ArrayList<Movie> m=new ArrayList<>();
			for(int j=0; j<3; j++)
			{
				System.out.println("Enter Movie Id,name,boxofficecollection,rating");
				int m_id=sc.nextInt();
				String m_name=sc.next();
			    int boxofficecol=sc.nextInt();
			    int rating=sc.nextInt();
			    m.add(new Movie(m_id,m_name,boxofficecol,rating));
			    Collections.sort(m);
			}
			t.add(new Theater(id,name,m));
		}
		
      System.out.println(t);

		}

	}


