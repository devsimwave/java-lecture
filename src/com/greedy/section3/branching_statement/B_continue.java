package com.greedy.section3.branching_statement;

public class B_continue {

	public void testSimpleContinueStatement() {
		
		/* 1부터 100 사이의 4의 배수이면서 5의 배수인 값 출력 */
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 4 == 0 && i % 5 == 0) {
				System.out.println(i);
			} else {
				continue;
//				System.out.println(i + "는 4와 5의 공배수가 아닙니다.");
			}
		
		}
	
	
	}

	public void testSimpleContinueStatement2() {
		
		for(int dan = 2; dan < 10; dan++) {
		
			for(int su = 1; su < 10; su++) {
				
				if(su % 2 == 0) {
					continue;
				}

				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
			System.out.println();
		}
		
	}

	public void testJumbContinue() {
		
		label:
		for(int dan = 2; dan < 10; dan++) {
			
			for(int su = 1; su < 10; su++) {
				if(su % 2 == 0) {
					
					
					continue label;
				}
				System.out.println(dan + " * " + su + " = " + (dan*su));
			}
			
			System.out.println();
		}
	}
}
