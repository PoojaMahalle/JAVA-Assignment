package overriding;

public class Person {

	String name,contact,address;
	
	void setPersonData(String name,String contact,String address)
	{
		this.name=name;
		this.contact=contact;
		this.address=address;
	}
	
	 void display() 
	  {
	  System.out.println(name+" "+contact+" "+address); 
	  }
	
}
