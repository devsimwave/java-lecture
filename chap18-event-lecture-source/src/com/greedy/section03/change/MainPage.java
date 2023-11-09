package com.greedy.section03.change;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MainPage extends JPanel{ 		// 가장 첫 화면에 나올 거
	
	private MainFrame mf;
	private MainPage mainPage;
	
	public MainPage(MainFrame mf) {
		this.mf = mf;
		this.mainPage = this;
		
		this.addMouseListener(new MyMouseAdapter());
		
		this.setBackground(Color.BLUE);
		this.setSize(300, 200);
		
		mf.add(this);
	}
	
	private class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			ViewUtil.changePanel(mf, mainPage, new SubPage());
		}
	}
}
