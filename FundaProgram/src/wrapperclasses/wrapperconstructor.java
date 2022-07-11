package wrapperclasses;

public class wrapperconstructor {
	public static void main(String[] args) {
		
		Integer i1=new Integer(20);//constructor by using int value directly or string
		Integer i2=new Integer("20");
		
		Character c1=new Character('s');
		
		Float f1= new Float(3.5f);
		Float f2= new Float(3.5);
		Float f3= new Float("3.5");
		
		//valueOf wrap primitive data type to wrapper classes public static
		//3 overloaded method for byte,short,int long
		
		Integer it1= Integer.valueOf(30);//for backend we use value of method
		Integer it2= Integer.valueOf("30");//we use mostly string for backend
		Integer it3= Integer.valueOf("111",2);// 1*2^2  1*2^1  1*2^0 = 4+2+1=7
		//we use string and radix;always take string value no less than radix.
		//Integer it3= Integer.valueOf("321",4);// 3*4^2  2*4^1  1*4^0 = 48+8+1=57
		
		System.out.println(it3);
		
		int i = Integer.parseInt("30");//only int value allowed 
		//int d=Integer.parsenInt("abc");//it is not allowed
		float f= Float.parseFloat("30.5");
		
		System.out.println(f);
		//float c3.Float.parseFloat("abc");//it is not allowed
		//System.out.println(c3);
		
		
	}

}
