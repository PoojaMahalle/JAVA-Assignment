package abstractinjava;

public class BikeMain {

	public static void main(String[] args) {

            Pulsor p1 = new Pulsor();
            p1.setBikeData(100000, "Black", "Bajaj");
            p1.setData1("PulsorRs", "240 cc", "fullpayment");
            System.out.println(p1);
            
            p1.wheelno();
            p1.gears();
            p1.features();
            p1.seatNo();
            p1.discount();
            
            System.out.println();
            
            Activa a1 = new Activa();
            a1.setBikeData(80000, "White", "Honda");
            a1.setData2("5G", "109 cc", "Halfpayment");
            System.out.println(a1);
            
            a1.wheelno();
            a1.gears();
            a1.features();
            a1.seatNo();
            a1.discount();

	}

}
