package com.greedy.section01.container;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {

	/* java.swing.JFrame 클래스를 상속받아 생성자에서 프레임에 대한 설정하는 방법 */

	public JFrameTest1() {
		/* 프레임의 크기 설정*/
		this.setLocation(300, 200);  		//프레임을 생성할 위치 x, y좌표로
		this.setSize(800, 500); 			//프레임의 크기
	
		/* 프레임 상단의 타이틀 생성*/
		this.setTitle("MyFrame"); 			//타이틀을 설정하는 방법.
		
		/* 프레임 사이즈 조절 가능에 대한 설정 기본값 true, false는 조절 불가능*/
		this.setResizable(false);
		
		
		/* 프레임 상단의 이미지 아이콘 변경 설정*/
		try {
			this.setIconImage(ImageIO.read(new File("images/icon.PNG")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		/* 프레임이 보여지게 하기 위한 설정*/
		this.setVisible(true); 				//프레임은 기본적으로 안보여지는 특성을 가지고 있어 true로 바꿔줘야함

		/* 닫기 버튼(x버튼)을 눌러도 프로세스는 계속 실행중인데, 닫기를 눌렀을 때 프로세스를 종료시키겠다는 설정*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}	
	

}
