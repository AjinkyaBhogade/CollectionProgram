package com.infotech.arraylist.pgm;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArryList {

	//Write a Java program to iterate through all elements in a array list
	
	public static void main(String[] args) {
	ArrayList<String> color=new ArrayList<>();
		
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		Iterator<String> itr=color.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
