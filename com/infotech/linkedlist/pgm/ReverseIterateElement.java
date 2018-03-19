package com.infotech.linkedlist.pgm;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterateElement {

	// Write a Java program to iterate through all elements in a linked list.
		public static void main(String[] args) {
			
			LinkedList<String> name=new LinkedList<>();
			name.add("Rohit");
			name.add("Shikhar");
			name.add("Virat");
			name.add("Ajinkya");
			name.add("Mahendra");
			
			//Collections.reverse(name);
			//System.out.println(name);
			Iterator<String> itr=name.descendingIterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
}
