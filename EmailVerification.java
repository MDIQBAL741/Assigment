package practice;

import java.util.regex.*;
import java.lang.Iterable;
import java.util.Scanner;

public class EmailVerification {
	
	static String arr[]={"iqbal@gmail.com"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailVerification as=new EmailVerification();
		Scanner sc=new Scanner(System.in);
		String regex = "iqbal@gmail.com";
		
		System.out.println("Enter mail id: ");
		String name = sc.nextLine();
		
		Pattern pattern = Pattern.compile(regex);
		
		for(String a : arr) {
		Matcher matcher = pattern.matcher(name);
		
		
		System.out.println("email id "+name+" : "+ matcher.matches()+"\n");
		
		
	}

}
}
