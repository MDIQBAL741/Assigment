package practice;

class Priv{
	private void display() {
		System.out.println("are using private access specifier");
	}
}

public class PrivateAccces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Private Access Specifier");
		Priv p=new Priv();
	
	}

}
