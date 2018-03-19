package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class DisplayElementAndPosition {

	//Write a Java program to display the elements and their positions in a linked list.
	
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		name.add("Rohit");
		name.add("Shikhar");
		name.add("Virat");
		name.add("Ajinkya");
		name.add("Mahendra");
		
		for(int i=0;i<name.size();i++){
			System.out.println("Element at index "+i+": "+name.get(i));
		}
	}
}
