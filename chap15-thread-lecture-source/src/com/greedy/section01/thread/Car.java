package com.greedy.section01.thread;

public class Car extends Thread {
	
	@Override
	public void run() { 		//메인메소드랑 비슷한 용도로 메소드를 만듬.
		
		for(int i = 1; i < 1000; i++) {
			System.out.println("Car driving");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
