package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	static List<Student> list = Arrays.asList(
		new Student("홍길동", "남자", 90, 80),
		new Student("김순희", "여자", 90, 85),
		new Student("감자바", "남자", 95, 85),
		new Student("박한나", "여자", 92, 85)
	);
	static double avg(Predicate<Student> pred) {
		int sum = 0, cnt = 0;
		for(Student student : list) {
			if(pred.test(student)) {//return 타입 : boolean
				sum += student.getEnglishScore();
				cnt++;
			}
		}
		return (double) sum / cnt;
	}
	public static void main(String[] args) {
		//익명객체 남자의 영어 평균
		double result = avg(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				if(t.getSex().equals("남자"))
					return true;
				else
					return false;
			}
		});
		
		System.out.println(result);
		
		//람다표현식 여자의 영어 평균
		double result2 = avg(t -> t.getSex().equals("여자"));
		System.out.println(result2);
		
		
		
		
	}
}
