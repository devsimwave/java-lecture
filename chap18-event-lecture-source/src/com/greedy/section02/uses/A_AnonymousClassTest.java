package com.greedy.section02.uses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_AnonymousClassTest {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame("익명클래스 예제");
		mf.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("버튼을 눌러보세요"); 
		JLabel label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		button.addActionListener(new ActionListener() { 	//익명클래스이고 한번만 사용할 목적이고 직접 지역변수를 접근할 수 있는 장점이 있어 사용한다. 하지만 재사용이 불가능하다는 단점을 가지고 있다.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == button) { 		//getSource() 이벤트가 발생한 객체를 의미
					label.setText("드디어 버튼이 눌러졌습니다.");
				}
			}
		});
		
		panel.add(button);
		panel.add(label);
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
