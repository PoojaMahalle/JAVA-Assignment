package ioserializableinnerclass;

public class LocalOuter {
	
	private int a=100;
	
	void display()
	{
		class Inner
		{
			final static int b=1000;
			void show()
			{
				System.out.println("Inside local inner class "+a);
			}
		}
		Inner in = new Inner();
		in.show();
	}

	public static void main(String[] args) {

		LocalOuter l = new LocalOuter();
		l.display();

	}

}
