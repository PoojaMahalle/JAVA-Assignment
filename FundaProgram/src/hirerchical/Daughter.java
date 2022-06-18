package hirerchical;

public class Daughter extends Father {

	String vehical;

	public String getVehical() {
		return vehical;
	}

	public void setVehical(String vehical) {
		this.vehical = vehical;
	}
	
	public String toString()
	{
		return name+" "+surname+" "+age+" "+vehical;
	}
}
