package com.subex.javatraining.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.subex.javatraining.constructors.Person;

public class HashMapDemo {
	public static void main(String[] args) {
		Map mp = new HashMap();
		
		mp.put(123, new Person("aravinda", 36, 5.8, 71));
		mp.put(124, new Person("xyp", 36, 5.8, 71));
		mp.put(125, new Person("abc", 36, 5.8, 71));
		mp.put(126, new Person("pqr", 36, 5.8, 71));
		
//		System.out.println(mp.values());
		Set keys = mp.keySet();
		Iterator it = keys.iterator();
		
		while(it.hasNext())
		{
			System.out.println(mp.get(it.next()));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
