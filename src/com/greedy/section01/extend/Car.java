package com.greedy.section01.extend;

public class Car {
	
	/* 자동차의 상태를 확인할 수 있는 필드*/
	private boolean runningStatus;
	
	public Car() {
		System.out.println("Car 클래스의 기본 생성자 호출됨...");
	}
	
	
	public void run() {
		runningStatus = true;
		System.out.println("자동차가 달립니다.");
	}
	
	public void soundHorn() {
		if(isRunning()) {	// isRunning 메소드의 불린 값을 반환
			System.out.println("빵빵");
		} else {
			System.out.println("주행중이 아닌 상테에서는 경적을 올릴 수 없습니다.");
		}
	}
	
	protected boolean isRunning() {
		return runningStatus;
	}
	
	public void stop() {
		runningStatus = false;
		System.out.println("자동차가 멈춥니다.");
	}	
	
	
}
