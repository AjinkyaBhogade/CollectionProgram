package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class RetriveAtSpecifiedIndex {
	
	// Write a Java program to retrieve an element
	//(at a specified index) from a given array list.
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		System.out.println(color.get(2));
	}

}
