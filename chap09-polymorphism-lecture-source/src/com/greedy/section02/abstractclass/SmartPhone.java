package com.greedy.section02.abstractclass;

public class SmartPhone extends Product {

	public SmartPhone() {
		System.out.println("SmartPhone의 기본 생성자 호출됨...");
	}
	
	@Override
	public void abstmethod() {
		System.out.println("Product 클래스의 abstMethod를 오버라이딩 한 메소드 호출함...");
		
	}
	
	
	public void printSmartPhone() {
		System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
	}
	
}
