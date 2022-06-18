package containment;

import java.util.Arrays;

public class DepartmentE {
	int totalemp;
    String dname;
    Employee emp[];
    
	public int getTotalemp() {
		return totalemp;
	}
	public void setTotalemp(int totalemp) {
		this.totalemp = totalemp;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Employee[] getEmp() {
		return emp;
	}
	public void setEmp(Employee[] emp) {
		this.emp = emp;
	}
	
	public String toString()
	{
		return dname+" "+totalemp+Arrays.toString(emp);
	}
    
}
