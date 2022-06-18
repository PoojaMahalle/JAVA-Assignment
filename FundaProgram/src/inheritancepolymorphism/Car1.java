package inheritancepolymorphism;

public class Car1 {
	int id, price;
	String name, model;

//	Car1(int id, String name, String model, int price) {
//		this.id = id;
//		this.name = name;
//		this.model = model;
//		this.price = price;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String toString()
	{
		return id+" "+name+" "+model+" "+price;
	}
}
