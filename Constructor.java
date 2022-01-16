package practice;

class Employee{
	String id,name;

	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("A102", "Iqbal");
		emp.display();
		
	}

}
