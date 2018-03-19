package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class IncreaseArrayListSize {

	//Write a Java program to increase the size of an array list.
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>(5);
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Grey");
		
		color.ensureCapacity(10);
		
		color.add("Pink");
		color.add("Black");
		
		System.out.println(color);
	}
}
