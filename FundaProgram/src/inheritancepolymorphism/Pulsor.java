package inheritancepolymorphism;

public class Pulsor extends Bike {

	int weight;
	String name,modelno;
	
//	void setPulsorData(String name,int weight,String modelno)
//	{
//		this.weight=weight;
//		this.modelno=modelno;
//	}
	
	void engine()
	{
		System.out.println("220 cc");
	}
	void gears()
	{
		super.gears();
		System.out.println("5 gears");
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

//	public String toString()
//	{
//		return name+" "+brand+" "+modelno+" "+milage+" "+weight+" "+price+" "+color;
//	}
}
