package wrapperclasses;

public enum Colors1 {
	
	ORANGE("Red","Yellow")
	{
		public String toString()
		{
			return "Mixture of two colors Red and Yellow";
		}
	},
	
	GREEN("Blue","Yellow")
	{
		public String toString()
		{
			return "Mixture of two colors Blue and Yellow";
		}
	},
	
	PINK("Red","White")
	{
		public String toString()
		{
			return "Mixture of two colors Red and White";
		}
	},
	
	BROWN("Red","Black")
	{
		public String toString()
		{
			return "Mixture of two colors Red and Black";
		}
	},
	PURPLE("Blue","Pink")
	{
		public String toString()
		{
			return "Mixture of two colors Blue and Pink";
		}
	};
	
	String c1,c2;
	private Colors1(String c1,String c2)
	{
		this.c1=c1;
		this.c2=c2;
	}
	
//	void message()
//	{
//		System.out.println("Mixture of colors: "+c1+" "+c2);
//	}

}
