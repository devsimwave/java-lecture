package com.greedy.section02.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{

	public C_GridLayout() {
		
		super("GridLayout");
		this.setBounds(300, 200, 800, 500); 			//위치 크기
		
		this.setLayout(new GridLayout(5, 5, 10, 20)); 		// 바둑판 비슷하게 나옴 오른쪽 세 네번쨰는 픽셀만큼 간격(순서는 행 열)
		
		for(int i = 1; i <= 25; i++) {
			String str = new Integer(i).toString(); 		// 이게 뭘까?
			this.add(new JButton(str));
		}
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
