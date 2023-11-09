package com.greedy.level04.advanced.view;

import java.util.Date;
import java.util.Scanner;

import com.greedy.level04.advanced.model.dto.BoardDTO;

public class InputBoard {

	public BoardDTO inputBoard() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 개시글 쓰기 입니다.");
		
		BoardDTO b = new BoardDTO();
		
		System.out.print("글 제목 : ");
		String title = sc.nextLine();
		b.setBoardTitle(title);
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		b.setBoardWriter(writer);
		
		Date date = new Date();
		b.setBoardDate(date);
		
		System.out.print("글 내용(exit 입력 시 종료) : ");
		String content = "";
		
		while(true) {
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			content += str + "\n";
		}
		
		b.setBoardContent(content);
		
		return b;
	}

	public int inputBoardNo() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("글 번호를 입력하세요 : ");
		int no = sc.nextInt();
		
		return no;
	}

	public String inputBoardTitle() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		return title;
	}

	public String inputBoardContent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("내용을 입력하세요 : ");
		String content = sc.nextLine();
		
		return content;
	}

	
}
