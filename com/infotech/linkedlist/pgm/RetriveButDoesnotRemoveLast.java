package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class RetriveButDoesnotRemoveLast {
	
//  Write a Java program to retrieve but does not remove, the last element of a linked list
	
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		System.out.println(name.peekLast());
		System.out.println(name);
	}


}
