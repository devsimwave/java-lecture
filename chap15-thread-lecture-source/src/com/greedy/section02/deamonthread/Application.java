package com.greedy.section02.deamonthread;

import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args) {
		
		Thread t = new CountDown();
		t.setDaemon(true);
		
		t.start();
		System.out.println(JOptionPane.showInputDialog("아무 문자열이나 입력하세요"));
		
		System.out.println("메인쓰레드 종료");
	}

}
