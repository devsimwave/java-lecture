package com.greedy.section03.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C_TextArea {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame();
		
		
		JTextField tf = new JTextField(30);
		JTextArea ta = new JTextArea(10, 30);
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				String text = tf.getText();
				ta.append(text + "\n"); 		// 입력한 글을 누적하기 위해서 append 메소드를 사용하고 개행을 위해서 \n을 설정해줌
				
				tf.selectAll(); 				// 입력하고 나서 글을 지우고 다시 작성하는게 아닌 전체 선택해줘서 직접 안지우고 삭제할 수 있음.
				
				tf.setText("");
				tf.requestFocus(); 				// 글을 입력하고 나서 전에 입력했던 값이 콘솔에서 없어지는 기능
			}
		});
		
		mf.add(tf, BorderLayout.NORTH);
		mf.add(ta, BorderLayout.SOUTH);
		
		mf.pack(); 	//프레임에 사이즈를 지정하지 않으면 가장 기본크기로 지정이 되는데 안에 있는 사이즈에 맞게끔 프레임의 사이즈를 지정하는것
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
		
	}

}

// 람다식 간단하게 사용할 수 있는데 전제조건은 메소드가 하나여야 된다.
