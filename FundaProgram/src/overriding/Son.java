package overriding;

public class Son extends Father {

	String sname;
	
	void setSonData(String sname)
	{
		this.sname=sname;
	}
	void display()
	{
		super.display();
		System.out.println(sname+" "+fname+" "+lname);
	}
}
