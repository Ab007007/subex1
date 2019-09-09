package com.subex.javatraining.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.subex.javatraining.constructors.PersonManager;

public class LinkedListDemo
{
	public static void main(String[] args) {
		
		//List al =  new ArrayList();
		List al = new LinkedList();
		al.add(10);
		al.add(0,"str");
		al.add("xyp");
		al.add(true);
		al.add(22.2);
		al.add(new PersonManager().get());
		al.add(new PersonManager().get(100));
		al.remove(new PersonManager().get());
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
