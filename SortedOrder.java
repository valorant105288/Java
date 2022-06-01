package demo;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedOrder {

	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet<Integer>();
		Scanner in= new Scanner(System.in);
		System.out.println("Eneter how many elemets u want to store: ");
		int n= in.nextInt();
		System.out.println("Enetr Elemets: ");
		for(int i=0;i<n; i++) {
			list.add(in.nextInt());
		}
		System.out.println(list);
		
		
	}

}
