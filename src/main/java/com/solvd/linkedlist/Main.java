 package com.solvd.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String [] args) {
		
		LinkedList list = new LinkedList();
		//using add
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("Size: "+ list.size()+", Is Empty: "+list.isEmpty());
		//using iterator
		Iterator i = list.iterator();
		System.out.println("items in the list:");
		while(i.hasNext()) {
			System.out.println(i.next().toString());
		}
		//using to array
		Object[] arr = list.toArray();
		System.out.println("-------------------------------------------------");
		System.out.println("items in array created from list:");
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j].toString());
		}
		System.out.println("-------------------------------------------------");
		//using remove
		System.out.println("Remove 'a' from the list: "+ list.remove("a"));
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		//using to array (array)
		Object[] s =list.toArray(arr);
		System.out.println("items in array created from list with an array as a parameter:");
		int k = 0;
		while (s[k]!=null) {
			System.out.println(s[k].toString());
			k++;
		}
		System.out.println("-------------------------------------------------");
		
		//contains
		System.out.println("List contains elemen'b'?:" + list.contains("b"));
		System.out.println("-------------------------------------------------");
		
		//add all
		ArrayList<String> collec = new ArrayList<String>();
		collec.add("g");
		collec.add("f");
		collec.add("z");
		Iterator iter = list.iterator();
		System.out.println("Adding 'g', 'f', 'z' using addAll: "+list.addAll(collec));
		System.out.println("items in the list:");
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
		System.out.println("-------------------------------------------------");
		
		//contains all
		System.out.println("Contains'g', 'f', 'z'?: "+list.containsAll(collec));
		collec.clear();
		collec.add("b");
		collec.add("r");
		collec.add("x");
		collec.add("e");
		System.out.println("Contains'b', 'r', 'x', 'e'?: "+list.containsAll(collec));
		System.out.println("-------------------------------------------------");
		
		//remove all
		System.out.println("Remove'b', 'r', 'x', 'e'?: "+list.removeAll(collec));
		iter = list.iterator();
		System.out.println("items in the list:");
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
		System.out.println("-------------------------------------------------");
		
		//retains all
		collec.clear();
		collec.add("d");
		collec.add("f");
		collec.add("x");
		collec.add("z");
		System.out.println("Retains'd', 'f', 'x', 'z'?: "+ list.retainAll(collec));
		iter = list.iterator();
		System.out.println("items in the list:");
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
		System.out.println("-------------------------------------------------");
		
		//get 
		System.out.println("Get the 2° item: "+ list.get(2));
		System.out.println("Get the 5° item: "+ list.get(5));
		System.out.println("-------------------------------------------------");
		
		//add in a pos 
		System.out.println("Adding 'h' in the position 3° ... ");
		list.add(3, "h");
		iter = list.iterator();
		System.out.println("items in the list:");
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
		System.out.println("-------------------------------------------------");
		
	}
	
}
