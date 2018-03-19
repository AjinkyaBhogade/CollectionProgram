package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class InsertElementAtFirstAndLast {

	//Java Collection, LinkedList Exercises: Insert elements into the linked list at the first and last position
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		
		name.addFirst("Suresh");
		name.addLast("Ravindra");
		
		System.out.println(name);
	}
}
