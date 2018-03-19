package com.infotech.arraylist.pgm;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion {

	// Write a Java program to extract a portion of a array list. 
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		List<String> subList=color.subList(0, 2);
		System.out.println(subList);
	}
}
