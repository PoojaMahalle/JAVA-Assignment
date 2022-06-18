package overriding;

public class Father extends GrandFather {

	String fname;
	
	void setFatherData(String fname)
	{
		this.fname=fname;
	}
	
	void display()
	{
		super.display();
		System.out.println(fname+" "+name+" "+lname);
	}
}
