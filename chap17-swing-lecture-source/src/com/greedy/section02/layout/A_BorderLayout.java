package com.greedy.section02.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame {

	public A_BorderLayout() {
		
		super("BorderLayout");
		
		this.setBounds(300, 200, 800, 500); 	//위치 설정
		
		
		/* 레이아웃 설정*/
//		this.setLayout(new BorderLayout());
		
		/* 버튼 생성*/
		JButton north = new JButton("북"); 		//버튼을 만드는 클래스이고 생성자에 
		JButton south = new JButton("남");
		JButton east = new JButton("동");
		JButton west = new JButton("서");
		JButton center = new JButton("가운데");
		
		/* 생성한 버튼을 프레임 위에 배치*/
//		this.add(north, "North");
//		this.add(south, "South");
//		this.add(east, "East");
//		this.add(west, "West");
//		this.add(center, "Center");

		this.add(north, BorderLayout.NORTH);
		this.add(south, BorderLayout.SOUTH);
		this.add(east, BorderLayout.EAST);
		this.add(west, BorderLayout.WEST);
		this.add(center, BorderLayout.CENTER);
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
