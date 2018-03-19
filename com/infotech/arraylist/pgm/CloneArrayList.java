package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class CloneArrayList {

	// Write a Java program to clone an array list to another array list
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Grey");
		
		ArrayList<String> cloneArrayList=(ArrayList<String>) color.clone();
		System.out.println(cloneArrayList);
				
	}
}
