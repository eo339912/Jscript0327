package com.yedam.api.String;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb);
		
		sb.insert(4,  "2");
		System.out.println(sb);
		
		sb.setCharAt(4, '6');
		System.out.println(sb);
		
		sb.replace(6,  13,  "book");
		System.out.println(sb);
		
		sb.delete(4,  5);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println(length);
		
		String result = sb.toString();
		System.out.println(result);
		
	}
}
