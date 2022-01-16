package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		ArrayList<String> list =new ArrayList<>();
		list.add("Heena");
		list.add("Manish");
		list.add("Babita");
		list.add("Kavish");
		list.add(null);
		list.add("Heena");
		System.out.println("ArrayList Elements:" + list);
		
		//LinkedList
		LinkedList<String> nlist =new LinkedList<>();
		nlist.add("Heena");
		nlist.add("Manish");
		nlist.add("Babita");
		nlist.add("Kavish");
		nlist.add(null);
		nlist.add("Heena");
		System.out.println("LinkedList Elements:" + nlist);
		//Vector
		Vector<String> vlist =new Vector<>();
		vlist.add("Heena");
		vlist.add("Manish");
		vlist.add("Babita");
		vlist.add("Kavish");
		vlist.add(null);
		vlist.add("Heena");
		System.out.println("Vector Elements:" + vlist);
		
	}

}
