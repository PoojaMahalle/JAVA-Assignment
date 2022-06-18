package classandobject;

public class Account {
	
	int accno,balance;
	String name,contact;

	int getBalance()
	{
		return balance;
	}
	void setBalance(int balance)
	{
		this.balance=balance;
	}
	int getAccno()
	{
		return accno;
	}
	void setAccno(int accno)
	{
		this.accno=accno;
	}
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getContact()
	{
		return contact;
	}
	void setContact(String contact)
	{
		this.contact=contact;
	}
	public String toString()
	{
		return accno+" "+name+" "+balance+" "+contact;
	}

}
