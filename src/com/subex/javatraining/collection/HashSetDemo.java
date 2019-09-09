package com.subex.javatraining.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		//Set s =  new LinkedHashSet();
		//Set s = new TreeSet();
	s.add(10);
	s.add(2);
	s.add(5.5);
	s.add(3.5);
		
		System.out.println("Size " + s.size());
		Iterator it =  s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	
	}
}
