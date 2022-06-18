package abstractinjava;

public interface Collage {
 
	void uniform();
	void idCard();
	void transport();
	
	default void canteen()
	{
		System.out.println("Canteen not compulsory");
	}
	default void library()
	{
		System.out.println("membership is mandatory");
	}
	default void labotary()
	{
		account();
		System.out.println("Labotary");
	}
	
	private void account()
	{
		System.out.println("Confidential information");
	}
}
