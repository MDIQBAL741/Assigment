package practice;

public class CallMethod {
	int a=20;
	int operation(int a) {
		int res =a*10/100;
		System.out.println("after calling operation = "+res);
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMethod c=new CallMethod();
		System.out.println("before calling operation = "+c.a);
		c.operation(50);
		
	}

}
