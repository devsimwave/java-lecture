package com.greedy.section06.singleton;

public class EagerSingleton {

	private static EagerSingleton eager = new EagerSingleton();	//프로그램이 시작 될 때 초기화 되는거 이른 초기화
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance() {
		return eager;
		
	}
}
