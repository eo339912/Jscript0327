package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {

	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용건", 95, 92)
	);
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	public static double avg(ToIntFunction<Student> function) {
		double avg = 0;
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		avg = sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		System.out.println("[학생이름]");
		//
		printString(new Function<Student, String>(){
			@Override
			public String apply(Student t) {
				return t.getName();
			}
		});
		//
		printString(t -> t.getName());
		
		System.out.println("[영어점수]");
		printInt(t -> t.getEnglishScore());
		double avg = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				return s.getEnglishScore();
			}
		});
		System.out.println("평균 : " + avg);
		
		System.out.println("[수학점수]");
		printInt(t -> t.getMathScore());
		double avg1 = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				return s.getMathScore();
			}
		});
		System.out.println(avg1);
		System.out.println("평균 : " + avg(s -> s.getMathScore()));
		
		
	}
}

//ToIntFunction<Student>를 구현하는 class 


class MathIntClass implements ToIntFunction<Student>{
	   @Override
	   public int applyAsInt(Student s) {
	      return s.getMathScore();
	   }
	}