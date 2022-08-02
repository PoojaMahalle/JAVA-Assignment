package treemap;

public class Bike1NameComparator {
	
	public int compare(Bike b1, Bike b2)
	{
		if(b1.brand.equalsIgnoreCase(b2.brand))
			return b1.id-b2.id;
		else
		return b1.name.compareTo(b2.name);
	}

}
