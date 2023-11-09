package com.greedy.section02.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame { 		//CardLayout이란

	public D_CardLayout() {
		
		super("CardLayout");
		this.setBounds(300, 200, 800, 500);
		
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		/* 패널 만들기*/
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		card1.setBackground(Color.BLUE); 			//상수로 지정했기 때문에 대문자 사용하자
		card2.setBackground(Color.YELLOW);
		/* Red, Green, Blue (RGB) */
		card3.setBackground(new Color(50, 100, 50));
		
		/* 메인프레임에 패널 추가*/
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		/* 패널에 이벤트 추가 */
		card1.addMouseListener(new MouseAdapter() { //리스너를 상속받은 클래스
			@Override
			public void mouseClicked(MouseEvent e) {	// 패널을 클릭했을 떄 안에 있는 내용이 실행된다.
				if(e.getButton() == 1) {
					card.next(card1.getParent()); 	// 1번이 속해있는 컨테이너를 반환해줌 다음꺼 보여주는 기능
				}
				if(e.getButton() == 3) {
					card.previous(card1.getParent()); // 이전꺼 반환해줌
				}
			}
		});
		
		card2.addMouseListener(new MouseAdapter() { //리스너를 상속받은 클래스
			@Override
			public void mouseClicked(MouseEvent e) {	// 패널을 클릭했을 떄 안에 있는 내용이 실행된다.
				if(e.getButton() == 1) {
					card.next(card2.getParent()); 	// 1번이 속해있는 컨테이너를 반환해줌 다음꺼 보여주는 기능
				}
				if(e.getButton() == 3) {
					card.previous(card2.getParent()); // 이전꺼 반환해줌
				}
			}
		});
		
		card3.addMouseListener(new MouseAdapter() { //리스너를 상속받은 클래스
			@Override
			public void mouseClicked(MouseEvent e) {	// 패널을 클릭했을 떄 안에 있는 내용이 실행된다.
				if(e.getButton() == 1) {
					card.next(card3.getParent()); 	// 1번이 속해있는 컨테이너를 반환해줌 다음꺼 보여주는 기능
				}
				if(e.getButton() == 3) {
					card.previous(card3.getParent()); // 이전꺼 반환해줌
				}
			}
		});
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
}

