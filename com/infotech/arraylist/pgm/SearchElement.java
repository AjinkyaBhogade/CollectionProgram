package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class SearchElement {
	
	// Write a Java program to search an element in a array list
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		System.out.println(color.contains("Black"));
	}

}
