package car;

public class Car2 {

        int id,price,installment,discount;
		String name,year,brandname,payment;
		
		int getId()
		{
			return id;
		}
		void setId(int id)
		{
			this.id=id;
		}
		
		int getPrice()
		{
			return price*price;//5000*5000
		}
		void setPrice(int price)
		{
			this.price=price;//5000
		}
		
		String getName()
		{
			return name;
		}
		void setName(String name)
		{
			this.name=name;
		}
		
		String getYear()
		{
			return year;
		}
		void setYear(String year)
		{
			this.year=year;
		}
		
		String getBrandname()
		{
			return brandname;
		}
		void setBrandname(String brandname)
		{
			this.brandname=brandname;
		}
		
		int getInstallment()
		{
			return installment;
		}
		void setInstallment(int installment)
		{
			this.installment=installment;
		}
		
		String getPayment()
		{
			return payment;
		}
		void setPayment(String payment)
		{
			this.payment=payment;
		}
		
		
		
		
		
		public String toString()
		{
			return id+" "+price+" "+name+" "+year+" "+brandname;
					//+" "+installment+" "+payment;
		}

	

}
