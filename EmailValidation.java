package practice;
import java.util.regex.*;
import java.util.ArrayList;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> emails=new ArrayList<String>();
		emails.add("mdiqbal@gamil.com");
		emails.add("mdiqbal1@gamil.com");
		emails.add("mdiqbal2@gamil.com");
		emails.add("mdiqbal3@gamil.com");
		emails.add("mdiqbal4@gamil.com");
		emails.add("mdiqbal5@gamil.com");
		emails.add("@google.com");
		emails.add("iqbal#gmail.com");  
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);  
		for(String email : emails) {
		Matcher matcher = pattern.matcher(email);
		System.out.println(email +" : "+ matcher.matches()+"\n"); 
		}
	}

}
