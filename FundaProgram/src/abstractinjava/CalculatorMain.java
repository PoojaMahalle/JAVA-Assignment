package abstractinjava;

public class CalculatorMain {

	public static void main(String[] args) {

    System.out.println(Calculator.name);
    
    SciCalculator sc1 = new SciCalculator();
    sc1.add();
    sc1.substraction();
    sc1.multiplication();
    sc1.division();
    
    sc1.pow();
    sc1.square();

	}

}
