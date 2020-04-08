package com.yedam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
					new Student("홍길동", 92),
					new Student("신용권", 90),
					new Student("감자바", 82)
				);
		
		int sum = list.stream().mapToInt(s -> s.getScore()).sum();
		System.out.println(sum);
		
		OptionalInt sum2 = list.stream().mapToInt(s -> s.getScore()).reduce((a, b) -> a+b);
		System.out.println(sum2);
		if(sum2.isPresent()) {
			System.out.println(sum2.getAsInt());
		}
		
		//Student.getScore(int) reduce(0, 결과값)
		int sum3 = list.stream().mapToInt(s -> s.getScore()).reduce(0, (a, b) -> a+b);
		System.out.println(sum3);
		
	}
}
