package com.infotech.linkedlist.pgm;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
	
//  Write a Java program to convert a linked list to array list. 
	
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		//System.out.println(name.contains("Ajinkya"));
		//System.out.println(name);
		
		ArrayList<String> nameArr=new ArrayList<String>(name);
		System.out.println(nameArr);
	}

}
