package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class CloneList {
	
	//  Write a Java program to clone an linked list to another linked list. 
	
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		LinkedList<String> duplicate = (LinkedList<String>) name.clone();
		System.out.println(duplicate);
	}

}
