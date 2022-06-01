package demo;

import java.util.Hashtable;
import java.util.TreeMap;

public class Hash_MapSort {

	public static void main(String[] args) {
		Hashtable<String, Integer> list = new Hashtable<String, Integer>(); 
		list.put("boy1", 123456789);
		list.put("boy2", 987654321);
		list.put("boy3", 888886789);
		
		System.out.println("Before sort:"+list);
		
		TreeMap<String,Integer> listSorted = new TreeMap<String,Integer>(list);
		System.out.println("After sort:"+listSorted);
		

	}

}
