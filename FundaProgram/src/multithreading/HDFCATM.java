package multithreading;

public class HDFCATM implements Runnable{
	
	BankAccount obj= new BankAccount();
	
	public void run()
	{
		System.out.println("Depositing the amount please wait..!!");
		obj.transfer(20000);
		System.out.println("Transaction Done..!!");
	}

}
