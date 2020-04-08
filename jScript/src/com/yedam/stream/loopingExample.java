package com.yedam.stream;

import java.util.Arrays;

public class loopingExample {
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		System.out.println("[peak()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter(a -> a%2 == 0)
			.peek(n -> System.out.println(n));//루핑하는 메소드, 중간처리메소드
		//최종메소드가 아닌 중간처리메소드인 peek를 사용하면 동작하지 않는다.
		
		System.out.println("[최종처리 메소드를 마지막에 호출한 경우]");
		int total = Arrays.stream(intArr)
				.filter(a -> a%2 == 0)
				.peek(n -> System.out.println(n))
				.sum(); //최종처리메소드
		System.out.println("총합" + total);
		
		System.out.println("[forEach()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
		.filter(a -> a%2 ==0)
		.forEach(n -> System.out.println(n));//최종처리메소드
	}
}
