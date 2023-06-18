package com.greedy.section01.mouseandkey;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class B_KeyEvent extends JFrame implements KeyListener {

	public B_KeyEvent() {
		this.setTitle("키보드 이벤트");
		this.setSize(300, 200);
	
		JTextField tf = new JTextField();
		
		tf.addKeyListener(this);
		this.add(tf);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		
		new B_KeyEvent();
	}

	public void display(String s, KeyEvent e) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode(); 		// 키코드에 해당하는 정수 값 반환
		String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
	
		System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
		 
	}

	@Override
	public void keyTyped(KeyEvent e) { 	// 한 글자가 다 완성될 떄 까지 나오지 않다가 프레스가 다음으로 넘어갈 때 나온다
		this.display("keyTyped", e);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		this.display("keyPressed", e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		this.display("keyReleased", e);
	}
	
	
}
