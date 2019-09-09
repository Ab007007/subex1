package com.subex.javatraining.string;

public class StringBufferDemo {

	
	public static void main(String[] args) {
		String str = "i'm in Bangalore";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		//sb.append("pq999999999999999999999r");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		
	}
}
