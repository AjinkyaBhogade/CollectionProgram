package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class BasicArrayList {
	
	//Write a Java program to create a new array list, 
	//add some colors (string) and print out the collection.
	
	public static void main(String[] args) {
		
		ArrayList<String> color=new ArrayList<>();
		
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		System.out.println(color);
		
	}

}
