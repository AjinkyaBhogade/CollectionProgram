package com.infotech.arraylist.pgm;

import java.util.ArrayList;

public class CompareTwoArrayList {

	//Write a Java program to compare two array lists
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Grey");
		
		ArrayList<String> color2=new ArrayList<>();
		color2.add("White");
		color2.add("Green");
		color2.add("Blue");
		color2.add("Red");
		
		ArrayList<String> compare=new ArrayList<>();
		
		for(String e:color){
			compare.add(color2.contains(e)?"YES":"NO");
		}
		
		System.out.println(compare);
	}
	
}
