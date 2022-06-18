package encapsulation;

public class Bank {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setAccno(896541237);
		c1.setName("Anjali");
		c1.setBalance(50000);
		c1.setAddr("Pune");
		c1.setContact("978654123");
		
		c1.setBalance(10000);
		c1.setContact("889654133");
		System.out.println(c1.getName()+" "+c1.getAccno()+" "+c1.getBalance()+" "+c1.getAddr()+" "+c1.getContact());

	}

}
