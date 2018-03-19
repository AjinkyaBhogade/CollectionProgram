package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class InsertElementAtFirst {
	
	// Write a Java program to insert an element into the array list at the first position
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		color.add(0, "Black");
		System.out.println(color);
	}

}
