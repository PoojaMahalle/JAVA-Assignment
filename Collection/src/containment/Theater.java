package containment;

public class Theater {

	int id,noofmovies,total1daycollection;
	String name;
	
	Theater(int id,String name,int noofmovies,int total1daycollection)
	{
		this.id=id;
		this.name=name;
		this.noofmovies=noofmovies;
		this.total1daycollection=total1daycollection;
	}
	
	public String toString()
	{
		return id+" "+name+" "+noofmovies+" "+total1daycollection;
	}
	
}
