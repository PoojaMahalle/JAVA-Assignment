package classandobject;

public class Bank {

	void gpay(int amt,Account a)//a=a1
	{
		int bal=a.getBalance();
		System.out.println("Available balance: "+bal);
		if(bal>amt)
		{
			bal=bal-amt;
			a.setBalance(bal);
			System.out.println("Remaining balance: "+a.getBalance());
		}
		else
			System.out.println("Balance is less...");
	}
}
