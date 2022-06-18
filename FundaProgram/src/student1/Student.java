package student1;

public class Student {
	int id,percentage;
    String name,dept,city,contact;
    
    void Student(){}
    
    void setId(int id)
    {
    	this.id=id;
    }
    int getId()
    {
    	return id;
    }
    void setPercentage(int percentage)
    {
    	this.percentage=percentage;
    }
    int getPercentage()
    {
    	return percentage;
    }
    void setName(String name)
    {
    	this.name=name;
    }
    String getName()
    {
    	return name;
    }
    void setDept(String dept)
    {
    	this.dept=dept;
    }
    String getDept()
    {
    	return dept;
    }
    void setCity(String city)
    {
    	this.city=city;
    }
    String getCity()
    {
    	return city;
    }
    void setContact(String contact)
    {
    	this.contact=contact;
    }
    String getContact()
    {
    	return city;
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
