package inheritancepolymorphism;

public class PulsorRs extends Pulsor {

	String engine;
	int speed;
	
	void gears()
	{
		super.gears();
		System.out.println("6 gears");
	}
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
//	void setPulsorRsData(String engine, int speed)
//	{
//		this.engine=engine;
//		this.speed=speed;
//	}
	public String toString()
	{
		return name+" "+brand+" "+modelno+" "+milage+" "+weight+" "+price+" "+color+" "+speed+" "+engine+"cc";
	}
}
