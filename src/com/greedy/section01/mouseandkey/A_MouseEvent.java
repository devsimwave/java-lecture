package com.greedy.section01.mouseandkey;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_MouseEvent extends JFrame implements MouseListener, MouseMotionListener{  //mouselistener, mousemoutionlistener 인터페이스를 상속받으면 unimplement메소드 생성하라고 한다. 그러면 5개의 오버라이딩 된 메소드가 생성된다. 

	public A_MouseEvent() {
		this.setTitle("Mouse Event");
		this.setSize(300, 200);
	
		JPanel panel = new JPanel();
		
		panel.addMouseListener(this); 
		panel.addMouseMotionListener(this); 
		
		this.add(panel);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new A_MouseEvent();
		
	}

	public void display(String s, MouseEvent e) {
		System.out.println(s + " X = " + e.getX() + "y = " + e.getY());  // 오버라이딩 된 메소드에서 호출하기 위해서 사용 , x,y좌표를 나타내는 것
	}

	@Override
	public void mouseClicked(MouseEvent e) { 
		this.display("Mouse CLicked", e);  		// 마우스가 눌러지가 떼지는 거 까지 클릭이라고 한다.
		
	}

	
	@Override
	public void mousePressed(MouseEvent e) {  // 마우스가 눌렀을 때 좌표 나옴
		this.display("Mouse pressed", e);  	 	
		
	}

	@Override
	public void mouseReleased(MouseEvent e) { // 마우스가 떼 질 때 좌표 나옴
		this.display("Mouse released", e);  		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) { 	// 마우스가 영역 안으로 들어갔을때 좌표가 나옴
		this.display("Mouse entered", e);
	}

	@Override
	public void mouseExited(MouseEvent e) { 	// 마우스가 영역 밖으로 나왔을 때 좌표가 나옴
		this.display("mouse exited", e);
	}

	
//	MouseMotionListener 인터페이스 사용
	@Override
	public void mouseDragged(MouseEvent e) {	// 마우스 드래그 했을 떄 좌표가 나옴
		this.display("Mouse dragged", e);
	}

	@Override
	public void mouseMoved(MouseEvent e) { 		// 마우스 움직일 때 좌표가 나옴
		this.display("mouse moved", e);
	}

}
