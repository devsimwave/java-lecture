package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class C_ifElseif {

	public void testSimpleIfElseIfStatement() {

		/*
		 * [if-else-if문 표현식] if(조건식1) { 조건식1이 true일 때 실행할 명령문; } else if(조건식) { 조건식1이
		 * false이고 조건식 2가 true일 때 실행할 명령문; } else { 위의 조건 2개가 모두 거짓인 경우 실행할 명령문; }
		 */

		System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
		System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
		System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물었다.");

		System.out.print("어느 도끼가 너의 도끼냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();

		if (answer == 1) {
			System.out.println();
		} else if (answer == 2) {
			System.out.println();
		} else {
			System.out.println();
		}

		System.out.println();

	}

	public void testNestedIfElseIfstatement() {

		/*
		 * greedy 대학의 김xx교수는 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점 방식을 사용하고 있다. 90점 이상이면 'A'
		 * 80이상이면 'B' 70이상이면 C 60이상이면 D를 60점 미만인 경우에는 f를 학점 등급으로 하는 기준이다. 추가로 각 등급의 중간
		 * 점수 (95 85 75)인 경우 '+' 를 붙여서 등급을 세분화 하다 보니 신경쓸게 이만 저만이 아니다. 그리고 그 의뢰를 나한테 했다.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if(score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		if(score % 10 == 5 && score > 60) {
			grade += "+";
		}
		
		System.out.println(name + " 학생의 점수는 " + grade + " 학점 입니다.");
		
	}

}
