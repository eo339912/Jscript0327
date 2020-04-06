package com.yedam.lambda;

import java.util.function.Consumer;

class ConsumerCls implements Consumer<Member>{
	@Override
	public void accept(Member m) {
		System.out.println(m.getId());
	}}

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA : " + m.getName());
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB : " + m.getId());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
		
		//익명객체
		Consumer<Member> consumerA2 = new Consumer<Member>() {
			@Override
			public void accept(Member m) {
				System.out.println(m.getName());
			}
		};
		//구현클래스
		Consumer<Member> consumerB2 = new ConsumerCls();
		Consumer<Member> consumerAB2 = consumerA2.andThen(consumerB2);
		consumerAB2.accept(new Member("홍길동2", "hong2", null));
	}
}
