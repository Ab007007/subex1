package com.subex.javatraining.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountWordsInAString {

	public static void main(String[] args) {
		String str = "This is my first collection program after learning collection . This will be pass";
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		String[] words = str.split(" ");
		
		for (String word : words) 
		{
			if(mp.get(word) == null)
			{
				mp.put(word, 1);
			}
			else
			{
				mp.put(word, mp.get(word) + 1);
			}
		}
		
		Set<String> keys = mp.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext())
		{
			String key = it.next();
			System.out.println(key + " - " + mp.get(key));
		}
		
	}
}
