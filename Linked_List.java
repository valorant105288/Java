package demo;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		System.out.println("Enetr How Many Friends u want to store");
		Scanner in = new Scanner(System.in); 
		int n=in.nextInt();
		System.out.println("Enetr names: ");
		in.nextLine();
		for(int i=0;i<n;i++) {
			list.add(in.nextLine());
		}
		System.out.println(list);

	}

}
