package collection;

import java.util.ArrayList;

public class Company {
	int comp_id;
	String comp_name;
	ArrayList<Car> car;
	
	Company(int comp_id,String comp_name,ArrayList<Car> car)
	{
		this.comp_id=comp_id;
		this.comp_name=comp_name;
		this.car=car;
	}
	
	public String toString()
	{
		return comp_id+" "+comp_name+" "+car;
	}

}
