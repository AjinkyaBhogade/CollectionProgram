package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class RemoveAll {
	
	//Write a Java program to remove all the elements from a linked list.
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		
		name.removeAll(name);
		System.out.println(name);
	}

}
