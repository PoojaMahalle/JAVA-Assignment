package inheritancepolymorphism;

import java.util.Scanner;

public class BikeMain {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter: bikename,brand,model,milage,weight,price,color");
           int price=sc.nextInt();
           String color=sc.next();
           String milage=sc.next();
           String brand=sc.next();
           String name=sc.next();
           int weight=sc.nextInt();
           String model=sc.next();
           String engine = sc.next();
           int speed = sc.nextInt();
           
//           Pulsor p1 = new Pulsor();
//           p1.setBikeData(100000, "Black", "60 km/hr", "Bajaj");
//           p1.setPulsorData("Pulsor", 120, "Alpha");
//           
//           p1.setPrice(price);
//           p1.setColor(color);
//           p1.setMilage(milage);
//           p1.setBrand(brand);
//           p1.setName(name);
//           p1.setWeight(weight);
//           p1.setModelno(model);
//           
//           System.out.println(p1);
//           p1.gears();
//           p1.wheelno();
//           p1.engine();

           PulsorRs ps = new PulsorRs();
           ps.setPrice(price);
           ps.setColor(color);
           ps.setMilage(milage);
           ps.setBrand(brand);
           ps.setName(name);         
           ps.setWeight(weight);
           ps.setModelno(model);
           ps.setEngine(engine);
           ps.setSpeed(speed);
           
           System.out.println(ps);
           ps.gears();
           ps.wheelno();
           ps.engine();
	}

}
