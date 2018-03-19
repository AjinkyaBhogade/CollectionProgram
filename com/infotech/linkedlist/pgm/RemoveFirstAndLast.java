package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class RemoveFirstAndLast {

	// Write a Java program to remove first and last element from a linked list
	
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		
		name.removeFirst();
		name.removeLast();
		System.out.println(name);
	}
}
