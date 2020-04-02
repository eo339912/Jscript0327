package com.yedam.lambda;

import java.awt.Toolkit;
class RunnableCls implements Runnable{
	@Override
	public void run() {
		Toolkit tkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			tkit.beep();
			System.out.println("_");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class BasicExample {
	public static void main(String[] args) {
		RunnableCls rcs0 = new RunnableCls();//신규작업 인스턴스. (구현클래스)
		Thread thread0 = new Thread(rcs0);//쓰레드생성
		thread0.start();//신규쓰레드작업
		
		Runnable rcs = new Runnable() { //신규작업 인스턴스. (익명객체)
			@Override
			public void run() {
				Toolkit tkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<10; i++) {
					tkit.beep();
					System.out.println("_");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread thread = new Thread(rcs);//쓰레드생성
		thread.start();//신규쓰레드작업
		
		
		Thread thread1 = new Thread(() -> {
			Toolkit tkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<10; i++) {
				tkit.beep();
				System.out.println("_");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});//쓰레드생성
		thread1.start();//신규쓰레드작업
		
		for(int i=0; i<10; i++) {
			System.out.println("print it.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}//main
}//class
