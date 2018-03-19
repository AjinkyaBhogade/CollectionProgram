package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class InsertElement {
	
	// Write a Java program to insert the specified element at the specified position in the linked list. 
	
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		
		name.add(4,"Vijay");
		
		System.out.println(name);
	}

}
