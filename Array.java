package practice;

import java.util.Scanner;

public class Array {
	//Single Dimension Array
	int marks[]=new int[3];
	void display() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks of 3 subject ");
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
	}
	int cal() {
		int sum=0;
		for (int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
			
		}
		return sum;
	}
	
	//Multidimension Array
	
		int arr[][]=new int[3][2];
		void info() {
			Scanner sc=new Scanner(System.in);
			for(int row=0;row<arr.length;row++) {
				for (int col=0;col<arr.length;col++) {
					arr[row][col]=sc.nextInt();
				}
			}
		}
		void display2() {
			for(int row=0;row<arr.length;row++) {
				for (int col=0;col<arr.length;col++) {
				System.out.println(arr[row][col]+" ");	
				}
				System.out.println();
		}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a=new Array();
		a.display();
		System.out.println("Total = "+a.cal());
		a.info();
		a.display2();
	}

}
