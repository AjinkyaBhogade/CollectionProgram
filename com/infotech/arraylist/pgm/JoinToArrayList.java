package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class JoinToArrayList {
	
	// Write a Java program to join two array lists
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Grey");
		
		ArrayList<String> color2=new ArrayList<>();
		color2.add("black");
		color2.add("Pink");
		color2.add("Yellow");
		color2.add("Red");
		
		   ArrayList<String> join = new ArrayList<String>();
		   join.addAll(color);
		   join.addAll(color2);
		System.out.println(join);
	}

}
