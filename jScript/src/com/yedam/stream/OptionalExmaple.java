package com.yedam.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalExmaple {
	public static void main(String[] args) {
		IntStream intStream = IntStream.rangeClosed(1, 10);
		OptionalDouble d = intStream.filter(n -> n%2 == 0).average();
		if(d.isPresent()) { //값이 저장되어 있는지 여부
			System.out.println("결과 : " + d.getAsDouble());
		}else {
			System.out.println("처리결과 없습니다.");
		}
		
		intStream = IntStream.range(1,5);
		Double od = intStream.filter(n -> n%5 ==0).average()
				.orElse(0.0);//값이 없어서 에러가 나는 것을 막아준다.
		System.out.println(od);
		
		intStream = IntStream.range(1,5);
		intStream.filter(n -> n%2 ==0).average()
		.ifPresent(n->System.out.println(n));//값이 있을경우

	}
}
