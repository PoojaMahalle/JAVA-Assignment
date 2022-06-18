package abstractinjava;

public class Pulsor extends Bike {
	
	String engine,modelno,payment;
	
	void setData1(String engine,String modelno,String payment)
	{
		this.engine=engine;
		this.modelno=modelno;
		this.payment=payment;
	}
	
	void display()
	{
		super.display();
		System.out.println(engine+" "+modelno);
	}
	
	void gears()
	{
		System.out.println("Pulsor has 6 gears");
	}
	
	void features()
	{
		System.out.println("features: analog,speedometer,digital tachometer");
	}
	void seatNo()
	{
		System.out.println("Pulsor has 2 seats");
	}
	
	void discount()
	{
		if(payment.equals("fullpayment"))
		{
			double discount = price*20/100;
			System.out.println("The discount is "+discount);
		
		}
		else if(payment.equals("Halfpayment"))
		{
			double discount= price*15/100;
			System.out.println("The discount is "+discount);
		}
		else
		{
			System.out.println("No discount");
		}
	}
	
	

}
