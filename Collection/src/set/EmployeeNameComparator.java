package set;

public class EmployeeNameComparator {
	
	public int compare(Employee e1, Employee e2)
	{
		
		if(e1.dept.equalsIgnoreCase(e2.dept))
			return e1.id-e2.id;
		else
		return e1.name.compareTo(e2.name);
	}

}
