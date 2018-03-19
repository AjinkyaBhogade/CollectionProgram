package com.infotech.arraylist.pgm;

import java.util.ArrayList;
import java.util.Collections;

public class SortArryList {
	
	// Write a Java program to sort a given array list.
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		Collections.sort(color);
		System.out.println(color);
	}

}
