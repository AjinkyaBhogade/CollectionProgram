package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class TrimArrayListCapacity {
	
	// Write a Java program to trim the capacity of an array list the current list size
	public static void main(String[] args) {
	
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Grey");
		
		System.out.println(color);
		
		color.trimToSize();
		
		System.out.println(color);
	}

}
