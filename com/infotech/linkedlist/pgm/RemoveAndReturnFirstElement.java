package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class RemoveAndReturnFirstElement {
	
	//   Write a Java program to remove and return the first element of a linked list.
	
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		System.out.println(name.pop());
	}

}
