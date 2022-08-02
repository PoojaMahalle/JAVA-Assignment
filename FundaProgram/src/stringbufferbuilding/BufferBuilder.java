package stringbufferbuilding;

public class BufferBuilder {

	public static void main(String[] args) {
		StringBuffer sbf=new StringBuffer("Java");
        
        sbf.append(" Language");
        System.out.println(sbf);
        
        String s= new String("Java");
        s.concat("Language");
        System.out.println(s);
        
//        sbf.reverse();
//        System.out.println(sbf);
        
        System.out.println(sbf.capacity());//16+4  (current capacity*2)+2;
        System.out.println(sbf.length());
        
        sbf.replace(5, 8, "LAN");//start index,end index,replace(8-5)=3 char from 5
        System.out.println(sbf);
        
        sbf.delete(5, 8);//Java LANguage
        System.out.println(sbf);
        
        sbf.deleteCharAt(5);//Java guage
        System.out.println(sbf);
        
        System.out.println(sbf.indexOf("av"));
        
        sbf.insert(5, "Lang");
        System.out.println(sbf);
        
        sbf.insert(6, 3.5f);
        System.out.println(sbf);
        
        sbf.setCharAt(3, 'M');
        System.out.println(sbf);
         


	}

}
