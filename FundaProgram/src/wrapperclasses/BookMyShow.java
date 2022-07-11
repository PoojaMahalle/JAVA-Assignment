package wrapperclasses;

interface A
{
	void discription();
}

public enum BookMyShow implements A{
	
	SILVER(150)
	{
//		public String toString()
//		{
//			return "Rate of silver ticket is: Rs 150/-";
//		}
		
		public void discription()
		{
			System.out.println("Rate of silver ticket is: Rs 150/-");
		}
	},
	GOLD(200)
	{
//		public String toString()
//		{
//			return "Rate of gold ticket is: Rs 200/-";
//		}
		public void discription()
		{
			System.out.println("Rate of gold ticket is: Rs 200/-");
		}
	},
	PLATINUM(250)
	{
//		public String toString()
//		{
//			return "Rate of platinum ticket is: Rs 250/-";
//		}
		public void discription()
		{
			System.out.println("Rate of platinum ticket is: Rs 250/-");
		}
	};
	
	int rate;
	
	private BookMyShow(int rate)
	{
		this.rate=rate;
	}
	
	void message()
	{
		System.out.println("Rate of the ticket is: "+rate);
	}

}
