package overriding;

public class GrandFather {
    
	String name,mname,lname;
	
	void setGrandFatherData(String name,String mname,String lname)
	{
		this.name=name;
		this.mname=mname;
		this.lname=lname;
	}
	
	void display()
	{
		System.out.println(name+" "+mname+" "+lname);
	}
}
