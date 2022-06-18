package inheritancepolymorphism;

public class AreaOfShapes {
	void area(float r)
	{
		double areaofcircle = 3.14*r*r;
		System.out.println("Area of circle: "+areaofcircle);
	}
	
	void area(float a, float b)
	{
		float rectangle=a*b;
		System.out.println("Area of rectangle: "+rectangle);
	}
	
	void area(int a)
	{
		float square=a*a;
		System.out.println("Area of square: "+square);
	}
	
	void area(int h, int b)
	{
		float triangle=(h*b)/2;
		System.out.println("Area of triangle: "+triangle);
	}

	public static void main(String[] args) {
		AreaOfShapes a1 = new AreaOfShapes();
		a1.area(5.0f);
		a1.area(2.0f, 3.0f);
		a1.area(3);
		a1.area(8, 5);

	}

}
