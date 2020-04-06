package com.yedam.lambda;

import java.util.function.IntPredicate;
class IntPredicateClass implements IntPredicate {
	@Override
	public boolean test(int a) {
		return a%3 == 0;
	}
};
public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		//2의 배수검사
		//IntPredicate predicateA = a -> a%2 == 0;
		IntPredicate predicateA = new IntPredicate() {
			@Override
			public boolean test(int a) {
				return a%2 == 0;
			}
		};
		
		
		//3의 배수검사
		//IntPredicate predicateB = a -> a%3 == 0;
		IntPredicate predicateB = new IntPredicateClass();
		
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까?" + result);
		
		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 3또는 2의 배수입니까?" + result);
		
		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까?" + result);
	}
}

