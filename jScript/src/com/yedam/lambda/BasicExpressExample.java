package com.yedam.lambda;

//class RunnableImpl implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("runnable call.");
//	}	
//}
interface Myinterface{
	void method(int a);
}

interface MyInterfaceReturn{
	int getResult(int a, int b);
}

public class BasicExpressExample {
	public static void main(String[] args) {
		MyInterfaceReturn mfr1 = new MyInterfaceReturn() {
			@Override
			public int getResult(int a, int b) {
				return a + b;
			}
		};
		int result = mfr1.getResult(10, 20);
		System.out.println(result);
		
		MyInterfaceReturn mfr = (a, b) -> {
			return a * b;
		};
		result = mfr.getResult(10, 20);
		System.out.println(result);
		
		Myinterface mi  = (num) -> {
			System.out.println("method" + num);
		};
		mi.method(12);
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("runnablue call.");
			}
		};
		runnable.run();
		
		Runnable runnable1 = () -> {System.out.println("runnablue call.");};
		runnable1.run();
	}
}
