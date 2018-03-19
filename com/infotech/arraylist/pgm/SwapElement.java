package com.infotech.arraylist.pgm;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {
	//Write a Java program of swap two elements in an array list.
	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Grey");
		
		System.out.println("Before swap");
		
		for(String e:color){
			System.out.println(e);
		}
		
		Collections.swap(color, 0, 3);
		System.out.println("After swap");
		
		for(String e:color){
			System.out.println(e);
		}
	}
	
	

}
