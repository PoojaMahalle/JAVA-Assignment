package inheritancepolymorphism;

public class Car {

	int id;
	String name,brand;
	Driver d;
	
	//Aggrigation
//	Car(int id,String name,String brand,Driver d)
//	{
//		this.id=id;
//		this.name=name;
//		this.brand=brand;
//		this.d=d;
//	}
	
	//composition
	Car(int id,String name,String brand,int did,String dname,String dcontact)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.d=new Driver(did,dname,dcontact);
	}
	public String toString()
	{
		return id+" "+name+" "+brand+" "+d;
	}
}
