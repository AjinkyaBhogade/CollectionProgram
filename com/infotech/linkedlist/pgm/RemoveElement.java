package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class RemoveElement {
	
	//Write a Java program to remove a specified element from a linked list. 
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		
		name.remove("Rohit");
		System.out.println(name);
	}

}
