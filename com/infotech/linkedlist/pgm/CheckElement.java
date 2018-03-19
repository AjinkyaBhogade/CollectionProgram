package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class CheckElement {

//  Write a Java program to check if a particular element exists in a linked list
	
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		System.out.println(name.contains("Ajinkya"));
		System.out.println(name);
	}

}
