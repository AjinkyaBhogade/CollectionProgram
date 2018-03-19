package com.infotech.linkedlist.pgm;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateElementAtSpecifiedIndex {

	//Write a Java program to iterate through all elements in a linked list starting at the specified position.
		public static void main(String[] args) {
			
			LinkedList<String> name=new LinkedList<>();
			name.add("Rohit");
			name.add("Shikhar");
			name.add("Virat");
			name.add("Ajinkya");
			name.add("Mahendra");
			
			Iterator<String> itr=name.listIterator(5);
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			//System.out.println("Ajinkya");
		}
}
