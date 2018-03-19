package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class UpdateElement {
	
    //Write a Java program to update specific array element by given element
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.set(2, "Black");
		System.out.println(color);
		System.out.println(color.get(2));
	}

}
