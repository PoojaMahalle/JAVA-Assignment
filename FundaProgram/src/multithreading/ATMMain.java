package multithreading;

public class ATMMain {

	public static void main(String[] args) {


		HDFCATM atm1=new HDFCATM();
		Thread t1= new Thread(atm1);
		Thread t2= new Thread(atm1);
		
		t1.start();
		t2.start();

	}

}
