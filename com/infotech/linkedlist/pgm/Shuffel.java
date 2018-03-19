package com.infotech.linkedlist.pgm;

import java.util.Collections;
import java.util.LinkedList;

public class Shuffel {

	
	// Write a Java program to shuffle the elements in a linked list.
	
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		
		Collections.shuffle(name);
		
		System.out.println(name);
	}
}
