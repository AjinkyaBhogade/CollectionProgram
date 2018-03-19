package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class InsertElementAtLastOfList {

	//Write a Java program to insert the specified element at the end of a linked list.
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		
		name.offerLast("suresh");
		
		System.out.println(name);
	}
}
