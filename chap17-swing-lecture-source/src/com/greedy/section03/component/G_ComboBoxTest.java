package com.greedy.section03.component;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G_ComboBoxTest { // 여러개 사진 나오게 하는 클래스

	public static void main(String[] args) {

		JFrame mf = new JFrame();
		mf.setSize(300, 200);
		
		String[] animals = new String[] {"dog", "cat", "tiger"};
		
		JComboBox<String> animalList = new JComboBox<String>(animals);
		
		JLabel label = new JLabel();
		animalList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
				String name = (String) comboBox.getSelectedItem();
				
				Image img = new ImageIcon("images/" + name + ".PNG").getImage().getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(img));
				
			}
		});
		
		label.setHorizontalAlignment(JLabel.CENTER); 	// 중앙에 사진 정렬
		
		mf.add(animalList, BorderLayout.NORTH);
		mf.add(label, BorderLayout.SOUTH);
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
		
		
	}

}
