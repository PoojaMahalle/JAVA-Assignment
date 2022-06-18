package overriding;

public class Maruti extends Car{
	int id,installment;
	String modelno,paymentmode;
	
	void setMarutiData(int id,String modelno,String paymentmode,int installment)
	{
		this.id=id;
		this.modelno=modelno;
		this.paymentmode=paymentmode;
		this.installment=installment;
	}
	
	void display()
	{
		super.display();
		System.out.println(id+" "+modelno+" "+paymentmode+" "+installment);
	}

	void discount()
	{
		if(paymentmode.equals("cash") && installment==0)
		{
			double discount = price*20/100;
			System.out.println("The discount is "+discount);
		
		}
		else if(paymentmode.equals("online")&& installment==1)
		{
			double discount= price*15/100;
			System.out.println("The discount is "+discount);
		}
		else if(installment==2)
		{
			double discount= price*10/100;
			System.out.println("The discount is "+discount);
		}
		else if(installment==3)
		{
			double discount= price*5/100;
			System.out.println("The discount is "+discount);
		}
		else
		{
			System.out.println("No discount");
		}
	}
}
