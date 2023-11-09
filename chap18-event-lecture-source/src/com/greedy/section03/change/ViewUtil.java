package com.greedy.section03.change;

import javax.swing.JPanel;

public class ViewUtil {
	
	public static void changePanel(MainFrame mf, JPanel op, JPanel np) {
		mf.remove(op); //파란화면은 제거하고
		mf.add(np);	   // 노란화면이 나오게 한다.
		mf.repaint(); 	//새로고침을 위해 사용
		mf.revalidate(); // 
		
	}
	
}
