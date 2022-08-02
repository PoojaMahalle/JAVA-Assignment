package map;

public class Item {
	
	int id,cost;
	String name,company;
	
	Item(int id,String name,String company,int cost)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.cost=cost;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+company+" "+cost;
	}

}
