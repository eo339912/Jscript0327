package com.yedam.lambda;

import java.util.function.Consumer;

//1. 매개값이 있을때
@FunctionalInterface //interface의 기능을 체크한다.
interface MyInterface1{
	void get(String str); //functionalinterface의 target type가 된다.
	//void set(); 구현해야하는 기능이 한개여야한다.
}
//2. 리턴타입이 있을때
@FunctionalInterface
interface MyInterface2{
	String get(String str, String str1); 
}
//3. Consumer 제너릭타입사용
//@FunctionalInterface
//interface Consumer<T>{
//	void get(T t);
//}
/////////////////////////
class MyInterClass implements MyInterface1{
	@Override
	public void get(String str) {
		System.out.println("Hello");
	}
}
class ConsumerClass<T> implements Consumer<T>{
	@Override
	public void accept(T t) {
		System.out.println("Consumer");
	}
}
/////////////////////////main
public class BasicExample2 {
	public static void main(String[] args) {
		////////////////////////////////////////1.
		//구현클래스
		MyInterface1 m1 = new MyInterClass();
		m1.get("Hello");
		
		//익명객체
		MyInterface1 m2 = new MyInterClass() {
			@Override
			public void get(String s) {
				System.out.println(s);
			}
		};
		m2.get("Hello");
		
		//람다표현식
		MyInterface1 m3 = (s) -> {
				System.out.println(s);
		};
		m3.get("Hello");
		
		////////////////////////////////////////2.
		MyInterface2 mi2 = new MyInterface2() { //익명객체
			@Override
			public String get(String str, String str1) {
				return str.concat(str1);
			}
		};
		String result = mi2.get("Hello", "World");
		System.out.println(result);
		
		////////////////////////////////////////3.
		//consumer interface
		Consumer<Integer> c1 = new ConsumerClass<Integer>();
		c1.accept(12);
		
		Consumer<Integer> c2 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		c2.accept(12);
		
		Consumer<Integer> c3 = (t) -> {
			System.out.println(t);			
		};
		c3.accept(12);
	}
}
