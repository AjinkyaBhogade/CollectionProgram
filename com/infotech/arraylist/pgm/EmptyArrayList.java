package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class EmptyArrayList {
	
	// Write a Java program to empty an array list.
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Grey");
		
		color.removeAll(color);
		System.out.println(color);
		
	}

}
