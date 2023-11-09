package com.greedy.section02.uses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_OtherClassTest extends JFrame {

	public B_OtherClassTest() {
		this.setSize(300, 200);
		this.setTitle("다른 클래스 테스트");
	
		JPanel panel = new JPanel();
		JButton button = new JButton("버튼을 눌러보세요");
		JLabel label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		panel.add(button);
		panel.add(label);
		
		button.addActionListener(new MyEvent(button, label));
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}

class MyEvent implements ActionListener { 		// 지역변수 접근이 불가능하지만, 재사용을 할 수 있는 장점이 있다.

	private JButton button;
	private JLabel label;
	
	public MyEvent(JButton button, JLabel label) {
		this.button = button;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			label.setText("드디어 버튼이 눌러졌습니다.");
		}
	}
	
}






