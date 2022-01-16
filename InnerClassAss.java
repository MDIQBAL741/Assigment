package practice;

abstract class Inner {
	   public abstract void display();
	}
	public class InnerClassAss {

	public static void main(String[] args) {
		Inner i = new Inner() {
	         public void display() {
	            System.out.println("Inner Class");
	         }
	      };
	      i.display();
	   }
	}

