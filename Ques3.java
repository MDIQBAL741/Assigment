package practice;



class Calculator{
		double n1,n2;

		public Calculator(double n1, double n2) {
			super();
			this.n1 = n1;
			this.n2 = n2;
		}
		void add() {
			double addition=n1+n2;
			System.out.println("addition ="+addition);
		}
		void sub() {
			double subtract=n1-n2;
			System.out.println("subtract ="+subtract);
		}
		void mul() {
			double multiplication=n1*n2;
			System.out.println("multiplication ="+multiplication);
	}
		void div() {
			double division=n1/n2;
			System.out.println("division ="+division);
		}
}
public class Ques3 {
	public static void main(String[] args) {
		
		Calculator c=new Calculator(65, 25);
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}
