package constructor;

import java.util.Scanner;

public class Theater {
	String name,movie1,movie2,movie3,movie4,adress,contact;
	
	Theater(){}
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setMovie1(String movie1)
	{
		this.movie1=movie1;
	}
	String getMovie1() 
	{
		return movie1;
	}
	void setMovie2(String movie2)
	{
		this.movie2=movie2;
	}
	String getMovie2() 
	{
		return movie2;
	}
	void setMovie3(String movie3)
	{
		this.movie3=movie3;
	}
	String getMovie3() 
	{
		return movie3;
	}
	void setMovie4(String movie4)
	{
		this.movie4=movie4;
	}
	String getMovie4() 
	{
		return movie4;
	}
	void setAddress(String adress)
	{
		this.adress=adress;
	}
	String getAdress() 
	{
		return adress;
	}
	void setContact(String contact)
	{
		this.contact=contact;
	}
	String getContact() 
	{
		return contact;
	}
	
	void movieDetails(String movie)
	{
		if(movie.equals(movie1))
		{
			System.out.println("Ticket Price: 150,200,250");
			System.out.println("Shows Timing: 9am,12pm,3pm,6pm,9pm");
		}
		else if(movie.equals(movie2))
		{
			System.out.println("Ticket Price: 150,200,250");
			System.out.println("Shows Timing: 9am,12pm,3pm,6pm,9pm");
		}
		else if(movie.equals(movie3))
		{
			System.out.println("Ticket Price: 150,200,250");
			System.out.println("Shows Timing: 9am,12pm,3pm,6pm,9pm");
		}
		else if(movie.equals(movie4))
		{
			System.out.println("Ticket Price: 150,200,250");
			System.out.println("Shows Timing: 9am,12pm,3pm,6pm,9pm");
		}
		else
		{
			System.out.println("no such movie");
		}

	}
	

	public static void main(String[] args) {
		
		Theater t = new Theater();
		t.setMovie1("Pushpa");
		t.setMovie2("Pawankhind");
		t.setMovie3("RRR");
		t.setMovie4("Gangubai");
		t.setName("Citypride");
		t.setAddress("Pune");
		t.setContact("978564321");
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println(t.getName());
		System.out.println("Movie: "+t.getMovie1()+"/"+t.getMovie2()+"/"+t.getMovie3()+"/"+t.getMovie4());
		System.out.println("Enter the movie name: ");
		String movie = sc.nextLine();
		t.movieDetails(movie);
		
		

	}

}
