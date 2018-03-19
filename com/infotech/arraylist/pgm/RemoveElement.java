package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class RemoveElement {
	
	// Write a Java program to remove the third element from a array list
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		color.remove(3);
		System.out.println(color);
	}

}
