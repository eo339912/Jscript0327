package com.yedam.lambda;

import java.util.function.IntBinaryOperator;
////////////////////////////////////////1.
//구현클래스
class IntBinaryClass implements IntBinaryOperator{
	@Override
	public int applyAsInt(int left, int right) {
		if(left >= right) {
			return left;
		}else {
			return right;
		}
	}
}
public class OperatorExample {
	private static int[] scores = {92, 95, 87};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	};
	

	public static void main(String[] args) {
		////////////////////////////////////////1.
		//구현클래스(큰값)
		IntBinaryClass iclass = new IntBinaryClass();
		int max = maxOrMin(iclass);
		System.out.println(max);
		
		////////////////////////////////////////2.
		//익명객체(작은값)
		int min = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				if(left >= right) {
					return right;
				}else {
					return left;
				}
			}
		});
		System.out.println(min);
		
		////////////////////////////////////////3.
		//람다표현식
		min = maxOrMin((left, right) -> {
				if(left >= right) {
					return right;
				}else {
					return left;
				}
		});
		System.out.println(min);
	}
}
