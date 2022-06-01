package demo;

import java.util.*;

public class Array__List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		ArrayList ll = new ArrayList();
		
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enetr how many cities u want");
		n=input.nextInt();
		System.out.println("Enetr "+n+" cities");
		input.nextLine();
		for(int i=0;i<n;i++) {
			ll.add(i,input.nextLine());
		}
		
		System.out.println(ll);
		ll.clear();
		System.out.println("After clear:"+ll);
		
		
		
		
		
		 
		

	}

}
