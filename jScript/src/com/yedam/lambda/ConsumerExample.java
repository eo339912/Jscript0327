package com.yedam.lambda;

import java.util.function.BiConsumer;

class Students{
	String name;
	int age;
	Students(String name, int age){
		this.name = name;
		this.age = age;
	}
	void getInfo() {
		System.out.println("name : " + this.name + ", age : " + this.age);
	}
}

public class ConsumerExample {
	public static void main(String[] args) {
		BiConsumer<Students, String> biCon = (std, str) -> {
			System.out.print(str + " ");
			std.getInfo(); //안녕하세요 이름 ? 나이 ??
		};
		biCon.accept(new Students("Hwang", 20), "안녕하세요");
		
		BiConsumer<String, String> biStr = (str1, str2) -> {
			System.out.println(str1 + " " + str2);
		};
		biStr.accept("Lambda", "example");
	}
	
	static <T, U> void printAccept(BiConsumer<Students, String> biCon2) {
		biCon2 = (s1, s2) -> {
			System.out.println(s2 + " ");
			s1.getInfo();
		};
		
		biCon2.accept(new Students("Hwang", 20), "안녕하세요");
	}
}
