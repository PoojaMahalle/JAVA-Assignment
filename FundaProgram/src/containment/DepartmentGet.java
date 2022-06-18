package containment;

import java.util.Arrays;

public class DepartmentGet {

	int did;
	String dname;
	StudentGet stud[];

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public StudentGet[] getStud() {
		return stud;
	}

	public void setStud(StudentGet[] stud) {
		this.stud = stud;
	}
	
	public String toString()
	{
		return did+" "+dname+" "+Arrays.toString(stud);
	}

	
	
}
