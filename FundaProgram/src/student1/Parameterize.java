package student1;

public class Parameterize {
	int id,percentage;
    String name,dept,city,contact;
    
    public Parameterize(int id,String name,int percentage,String dept,String city,String contact)
    {
    	this.id=id;
    	this.name=name;
    	this.percentage=percentage;
    	this.dept=dept;
    	this.city=city;
    	this.contact=contact;
    }
    
    public String toString()
    {
    	return id+" "+name+" "+percentage+" "+dept+" "+city+" "+contact;
    }
    
    void perc()
	{

		if(percentage > 80)
		{
			System.out.println("A grade");
		}
		else if(percentage > 60)
		{
			System.out.println("B grade");
		}
		else if(percentage > 50)
		{
			System.out.println("c grade");
		}
		else
		{
			System.out.println("Fail");
		}
    
	}
}
