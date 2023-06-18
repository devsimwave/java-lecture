package com.greedy.section02.uses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_InnerClassTest extends JFrame {

	private JButton button;
	private JLabel label;
	
	public C_InnerClassTest() {
		
		this.setTitle("내부클래스 테스트");
		this.setSize(300, 200);

		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");

		panel.add(button);
		panel.add(label);
		
		button.addActionListener(new MyEvent()); 		// 생성자를 호출해 인스턴스를 생성해 사용함.
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private class MyEvent implements ActionListener {		//내부클래스인데 내부클래스에서의 접근은 가능하지만 외부클래스에서의 접근은 불가능하다. B클래스에서는 생성자 사용을 해서 접근을 했지만 내부클래스를 사용하면 필드에 선언을 해주면 접근이 가능하다.

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("드디어 버튼이 눌러졌습니다.");
			}
			
		} 		
		
	}
	
	public static void main(String[] args) {
		new C_InnerClassTest();
		
	}

}
