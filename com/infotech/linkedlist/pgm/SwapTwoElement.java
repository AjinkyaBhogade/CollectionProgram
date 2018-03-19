package com.infotech.linkedlist.pgm;

import java.util.Collections;
import java.util.LinkedList;

public class SwapTwoElement {
	
	// Write a Java program of swap two elements in an linked list
	
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		
		Collections.swap(name, 1, 3);
		
		System.out.println(name);
	}

}
