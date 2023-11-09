package com.greedy.section02.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E_NullLayout extends JFrame {

	public E_NullLayout() {
		super("NullLayout");
		this.setBounds(200, 200, 500, 500);
		
		this.setLayout(null); 					// layout을 없애야만 위치와 크기를 지정할 수 있다.
		
		JLabel lb = new JLabel("이 름 : ");		// 텍스트나 이미지들을 올리기위해 사용하는 컴포넌트 
		lb.setLocation(50, 1000); 				// 라벨이 
		lb.setSize(150, 50);
//		lb.setBounds();	이걸로 한번에 다 가능
		
		JTextField tf = new JTextField();
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		JButton btn = new JButton("추 가");
		btn.setLocation(350, 100);
		btn.setSize(100, 50);
		
		this.add(lb);
		this.add(tf);
		this.add(btn);
		
		this.setVisible(true);		// 창이 보이게 하는 것
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}
}
