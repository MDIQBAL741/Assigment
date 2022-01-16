package practice;

import java.util.Scanner;

public class Calulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2,ans = 0;
		char op;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no.");
		n1=sc.nextDouble();
		System.out.println("Enter 2nd no.");
		n2=sc.nextDouble();
		System.out.println("Choose (+, -, *, /):");
		op = sc.next().charAt(0);
		switch(op) {
        case '+': ans = n1 + n2;
           break;
        case '-': ans = n1 - n2;
           break;
        case '*': ans = n1 * n2;
           break;
        case '/': ans = n1 / n2;
           break;
	}

		System.out.println("The final result:");
		 System.out.println(n1 + " " + op + " " + n2 + " = " +ans);
	}
}

