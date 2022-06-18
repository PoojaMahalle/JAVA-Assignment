package inheritancepolymorphism;

public class CarDriverMain {

	public static void main(String[] args) {
//		Driver d1 = new Driver(1001,"Sachin","9874563211");
//		Driver d2 = new Driver(1002,"Ramesh","8745632110");
//		
//		Car c1 = new Car(1,"Baleno","Maruti",d1);
//		Car c2 = new Car(2,"SwiftD","Maruti",d2);
		
		//composition
		Car c1 = new Car(1,"Baleno","Maruti",1001,"Sachin","9874563211");
		Car c2 = new Car(2,"SwiftD","Maruti",1002,"Ramesh","8745632110");
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
