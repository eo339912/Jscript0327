package com.yedam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		Stream<String> stream = list.stream();
		
		stream.distinct()	//중간처리 - distinct 중복제거
			.filter(s -> s.startsWith("신"))		//중간처리 - filter 신으로 시작하는 요소만 가져옴 
			.forEach(new Consumer<String>() { //.forEach(t-> System.out.println(t));
				@Override
				public void accept(String t) {
					System.out.println(t);
				}
			}); 
		
		 
			
		
	}
}
