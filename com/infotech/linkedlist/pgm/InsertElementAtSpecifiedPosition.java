package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class InsertElementAtSpecifiedPosition {
	
	// Write a Java program to insert some elements at the specified position into a linked list..
		public static void main(String[] args) {
			LinkedList<String> name=new LinkedList<>();
			name.add("Rohit");
			name.add("Shikhar");
			name.add("Virat");
			name.add("Ajinkya");
			name.add("Mahendra");
			
			name.add(3,"Manish");
			
			System.out.println(name);
		}

}
