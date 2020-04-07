package com.yedam.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArr = {"Hong", "Hwang", "Choi"};
		Stream<String> strStream = Arrays.stream(strArr);
		System.out.println(strStream);
		
		int[] intArr = {3,4,5,6,2};
		IntStream intStream = Arrays.stream(intArr);
		System.out.println(intStream);
		
		strStream.forEach(s -> System.out.print(s + " "));
		intStream.forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println();		
		System.out.println("IntStream.range(1, 10) : 1~9");
		IntStream rangeStream = IntStream.range(1, 10);
		rangeStream.forEach(r -> System.out.print(r + " "));
		
		System.out.println();		
		System.out.println("IntStream.rangeClosed(1, 10) : 1~10");
		IntStream rangeStream2 = IntStream.rangeClosed(1, 10);
		rangeStream2.forEach(r -> System.out.print(r + " "));
		
		
	}
}
