package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class GetFirstAndLastElement {
	
	//Write a Java program to get the first and last occurrence of the specified elements in a linked list. 
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		
		System.out.println(name.getFirst());
		System.out.println(name.getLast());
	}

}
