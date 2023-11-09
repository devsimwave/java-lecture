package com.greedy.section01.container;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class JFrameTest2 {

	/* java.swing.JFrame 클래스를 인스턴스로 생성 후 해당 프레임 인스턴스의 메소드를 호출하여 설정값 변경하는 방법*/
	public void showMainFrame() {
		
		JFrame mainFrame = new JFrame("MYFrame2");
//		mainFrame.setBounds(300, 200, 800, 500);
		
		Rectangle rectangle = new Rectangle(300, 200, 800, 500);
		mainFrame.setBounds(rectangle);	//좌표 저장
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
