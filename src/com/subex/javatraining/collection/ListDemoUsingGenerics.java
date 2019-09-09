package com.subex.javatraining.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.subex.javatraining.constructors.PersonManager;

public class ListDemoUsingGenerics
{
	public static void main(String[] args) {
		
		//List al =  new ArrayList();
		List<Integer>  al = new ArrayList<Integer>();
		al.add(10);
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		/*
		 * for(int i=0;i<al.size();i++) { System.out.println(al.get(i)); }
		 */
		/*
		 * for (Object object : al) { System.out.println(object); }
		 */
	
	}

}
