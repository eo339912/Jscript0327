package com.yedam.stream.collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Gender.MALE),
				new Student("김수애", 6, Student.Gender.FEMALE),
				new Student("신용권", 10, Student.Gender.MALE),
				new Student("박수미", 6, Student.Gender.FEMALE)
			);
		
		//남학생들만 묶어 list 생성
		List<Student> maleList = totalList.stream()
				.filter(s->s.getGender() == Student.Gender.MALE)
				.collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//여학생들만 묶어 Set생성
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getGender() == Student.Gender.FEMALE)
				.collect(Collectors.toSet());
		femaleSet.stream().forEach(s-> System.out.println(s.getName()));
		
		System.out.println();
		
		//여학생들만 묶어 HashSet 생성
		Set<Student> femaleHSet = totalList.stream()
				.filter(s -> s.getScore() >= 6)
				.collect(Collectors.toCollection(() -> new HashSet<>())); //.toCollection(HashSet :: new);
		femaleHSet.stream()
		.forEach(s-> System.out.println(s.getName()));
	}
}
