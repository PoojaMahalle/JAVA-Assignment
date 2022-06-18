package inheritancepolymorphism;

public class Bike {

	int price;
	String color,milage,brand;
	
//	void setBikeData(int price,String color,String milage,String brand)
//	{
//		this.price=price;
//		this.color=color;
//		this.milage=milage;
//		this.brand=brand;
//	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMilage() {
		return milage;
	}

	public void setMilage(String milage) {
		this.milage = milage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	void wheelno()
	{
		System.out.println("2 wheels");
	}
	
	void seats()
	{
		System.out.println("2 seats");
	}
	
	void gears()
	{
		System.out.println("4 gears");
	}
}
