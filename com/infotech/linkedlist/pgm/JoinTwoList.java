package com.infotech.linkedlist.pgm;

import java.util.LinkedList;

public class JoinTwoList {
	
	//Write a Java program to join two linked lists.
	
	public static void main(String[] args) {
		LinkedList<String> batsman=new LinkedList<>();
		batsman.add("Rohit");
		batsman.add("Shikhar");
		batsman.add("Virat");
		batsman.add("Ajinkya");
		batsman.add("Mahendra");
		
		LinkedList<String> bowler=new LinkedList<>();
		bowler.add("Bhuvi");
		bowler.add("Jasprit");
		bowler.add("Kuldeep");
		bowler.add("Chahal");
		
		LinkedList<String> cricketer=new LinkedList<>();
		cricketer.addAll(batsman);
		cricketer.addAll(bowler);
		System.out.println(cricketer);
	}

}
