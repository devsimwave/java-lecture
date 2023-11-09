package com.greedy.section02.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame {

	public F_PanelLayout() {
		super("panelLayout");
		this.setBounds(200, 200, 500, 500);
		
		JLabel lb = new JLabel("이 름 : ");		// 텍스트나 이미지들을 올리기위해 사용하는 컴포넌트 
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		JTextField tf = new JTextField();
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		JButton btn = new JButton("추 가");
		btn.setLocation(350, 100);
		btn.setSize(100, 50);

		JPanel panel = new JPanel();
		
		panel.setSize(500, 500);
		
		panel.setLayout(null); //
		
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 사이즈 변경하려면 레이아웃 널값으로 해야된다.
	
	}
	
}
