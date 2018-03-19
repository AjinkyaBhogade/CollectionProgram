package com.infotech.arraylist.pgm;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArryListIntoAnother {
	
	//Write a Java program to copy one array list into another.
	
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		System.out.println(color);
		
		ArrayList<String> name=new ArrayList<>();
		name.add("Ajinkya");
		name.add("Ram");
		name.add("sham");
		name.add("pinki");
		
		System.out.println(name);
		
		Collections.copy(name,color);
		System.out.println(color);
		System.out.println(name);
	}

}
