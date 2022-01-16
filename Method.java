package practice;

public class Method {
	
	double multiply(double a,double b) {
	double result= a*b;
	System.out.print("multiplication = "+result);
	return  result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m=new Method();
		m.multiply(60, 5);
		
	}

}
