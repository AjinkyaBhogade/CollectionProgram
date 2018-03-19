package com.infotech.arraylist.pgm;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElement {
	
	//Write a Java program to reverse elements in a array list
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		Collections.reverse(color);
		System.out.println(color);
	}

}
