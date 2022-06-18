package inheritancepolymorphism;

public class Company {

	int c_id,year;
	String cname;
	Car1 c;
	
//	Company(int id, int year, String name,Car1 c)
//	{
//		this.id=id;
//		this.year=year;
//		this.name=name;
//		this.c=c;
//	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String name) {
		this.cname = name;
	}

	public Car1 getC() {
		return c;
	}

	public void setC(Car1 c) {
		this.c = c;
	}
	
	public String toString()
	{
		return c_id+" "+cname+" "+year+" "+c;
	}
}
