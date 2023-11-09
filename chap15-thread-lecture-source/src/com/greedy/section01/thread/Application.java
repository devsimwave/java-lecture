package com.greedy.section01.thread;

public class Application {

	public static void main(String[] args) {
	
//		Car car = new Car();
//		Tank tank = new Tank();
//		Plane plane = new Plane();
//	
//		Thread t1 = car;		//Thread타입으로 변환
//		Thread t2 = tank;
//		Thread t3 = new Thread (plane);      
		
		Thread t1 = new Car();
		Thread t2 = new Tank();
		Thread t3 = new Thread(new Plane());
		
//		t1.run();
//		t2.run();
//		t3.run();
		
		System.out.println("t1의 우선순위 : " + t1.getPriority()); 		
		System.out.println("t2의 우선순위 : " + t2.getPriority());
		System.out.println("t3의 우선순위 : " + t3.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("t1의 우선순위 : " + t1.getPriority()); 		//우선순위를 바꿔줄 때 getPriority() 메소드 사용
		System.out.println("t2의 우선순위 : " + t2.getPriority());
		System.out.println("t3의 우선순위 : " + t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
		/* 지정된 쓰레드가 종료될 때 까지 현제 쓰레드의 종료를 대기시킨다.*/
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------------- main end!!");
	}

}
