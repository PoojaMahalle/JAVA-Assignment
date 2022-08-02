package containment;

import java.util.ArrayList;

public class Company1 {
	int comp_id;
	String comp_name;
	ArrayList<Car1> car;
	
	Company1(int comp_id,String comp_name,ArrayList<Car1> car)
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
