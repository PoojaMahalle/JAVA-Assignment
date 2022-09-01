package multithreading;

public class BankAccount {

	int balance=5000;
	
	public synchronized void transfer(int amt)
	{
		System.out.println("Please wait..");
		synchronized(HDFCATM.class)
		{
		balance=balance+amt;
		System.out.println("Balance is: "+balance);
	}
	}
}
