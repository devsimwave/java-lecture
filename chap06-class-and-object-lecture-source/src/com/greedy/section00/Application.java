package com.greedy.section00;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//일반은 80 , 특수는 50
		/* 시작하기 start
		 * 강화하기 
		 * 특수강화하기
		 * 다시하기
		 * 종료하기 */
	
		ItemUP sword = new ItemUP();
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("===== 아이템 강화 프로그램 =====");
			System.out.println("1. 게임 시작하기");
			System.out.println("2. 아이템 강화하기");
			System.out.println("3. 특수강화하기");
			System.out.println("4. 게임 종료하기");
			System.out.print("목록을 선택하세요 : ");
			int selectNum = sc.nextInt();
			
			switch(selectNum) {
				case 1: sword.startGame(); break;
				case 2: sword.reinforcement(); break;
				case 3: sword.speReinforce(); break;
				case 5: System.out.println("게임이 종료되었습니다."); break;	
				default: System.out.println("다시 입력해주세요.");
			}
		
			if(selectNum == 5) {
				break;
			}
		
		}
	
	
	}

}
