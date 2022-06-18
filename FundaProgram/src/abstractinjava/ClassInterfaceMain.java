package abstractinjava;

class A1 {
	public void display() {
		System.out.println("In parent display method");
	    }
     }

        interface ABC {
	          void show();

	          void display();
     }

     public class ClassInterfaceMain extends A1 implements ABC {
         public void display()
         {
         	System.out.println("In child display method");
         }

	public static void main(String[] args) {
  
		ClassInterfaceMain c1 = new ClassInterfaceMain();
		c1.display();


	}

}
