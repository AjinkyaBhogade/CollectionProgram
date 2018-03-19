package com.infotech.hashmap.pgm;

import java.util.HashMap;
import java.util.Set;

import com.infotech.model.Student;

public class MyObjectInHashMap {

	
	public static void main(String[] args) {
		HashMap<Student, String> hm=new HashMap<>();
		hm.put(new Student(null, 26),"CHPL");
		hm.put(new Student("Ram", 24),"Infosys");
		//System.out.println(hm.get(new Student("Ram", 24) ));
		Set<Student> key=hm.keySet();
		for(Student st:key){
			System.out.println(st.getClass());
		}
	}
}
