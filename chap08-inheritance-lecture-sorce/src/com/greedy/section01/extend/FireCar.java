package com.greedy.section01.extend;

public class FireCar extends Car {	// Car 클래스 상속

	/* 부모 클래스가 가지는 멤버를 다 상속받지만, private 멤버는 접근 불가능하며
	 * 생성자는 상속되지 않는다.
	 * */

	public FireCar() {
		super();	// 컴파일러가 super() 생성자를 호출시켜서 굳이 안써도됨.
		System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
	}

	/* @Override 어노테이션
	 * JDK 1.5부터 추가된 분법으로 오버라이딩 성립 요건을 체크하며 성립되지 않는 경우 컴파일 에러를 발생시킨다.*/
	
	@Override	// 오버라이딩 성립요건을 확인해주는 기능
	// 재작성할 준비가 됐다.
	
	// 부모클래스의 필드와 속성과 기능이 private이면 접근을 못해서 부모클래스에서 접근제한자를  protected로 바꿔준다.
	
	public void soundHorn() {
		
		if(isRunning()) {
			System.out.println("빠아아아아아아아아앙");
		} else {
			System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세요 비켜");
		}
	}

	public void sprayWater() {
		System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ==================================>>>");
	}
}
