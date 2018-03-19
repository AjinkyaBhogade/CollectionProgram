package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class CheckArryListIsEmpty {

	// Write a Java program to test an array list is empty or not
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Grey");
		
		System.out.println(color.isEmpty());
		
		color.removeAll(color);
		
		System.out.println(color.isEmpty());
	}
}
