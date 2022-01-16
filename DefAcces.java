package practice;

class Default
{ 
  void display() 
     { 
         System.out.println("This is default acces modifier"); 
     } 
} 

public class DefAcces {

	public static void main(String[] args) {
		//default
		System.out.println("Hii");
		Default obj = new Default(); 		  
        obj.display(); 
        
	}
}

