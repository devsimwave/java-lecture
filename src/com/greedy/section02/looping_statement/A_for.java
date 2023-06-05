package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class A_for {

	public void testSimpleForStatemet() {

		/*
		 * 반복문의 기본 흐름 테스트 [for문 표현식] for(초기식; 조건식; 증감식) { 조건을 만족하는 경우 수행할 구문(반복할 구문) }
		 */

		for (int i = 0; i < 10; i++) { // 조건식은 반복문을 끝내는 목적.
			System.out.println(i);
		}

	}

	public void testForExample() {

		/* 10명의 학생을 입력받고 출력하는 연습. */
		Scanner sc = new Scanner(System.in);

		System.out.print("1번째 학생의 이름을 입력해주세요 : ");
		String student1 = sc.nextLine();
		System.out.println("1번째 학생의 이름은 " + student1 + " 입니다.");

		System.out.print("2번째 학생의 이름을 입력해주세요 : ");
		String student2 = sc.nextLine();
		System.out.println("2번째 학생의 이름은 " + student2 + " 입니다.");

		System.out.print("3번째 학생의 이름을 입력해주세요 : ");
		String student3 = sc.nextLine();
		System.out.println("3번째 학생의 이름은 " + student3 + " 입니다.");

		System.out.print("4번째 학생의 이름을 입력해주세요 : ");
		String student4 = sc.nextLine();
		System.out.println("4번째 학생의 이름은 " + student4 + " 입니다.");

		System.out.print("5번째 학생의 이름을 입력해주세요");
		String student5 = sc.nextLine();
		System.out.println("5번째 학생의 이름은 " + student5 + " 입니다.");

		System.out.print("6번째 학생의 이름을 입력해주세요");
		String student6 = sc.nextLine();
		System.out.println("5번째 학생의 이름은 " + student6 + " 입니다.");

		System.out.print("7번째 학생의 이름을 입력해주세요");
		String student7 = sc.nextLine();
		System.out.println("7번째 학생의 이름은 " + student7 + " 입니다.");

		System.out.print("8번째 학생의 이름을 입력해주세요");
		String student8 = sc.nextLine();
		System.out.println("8번째 학생의 이름은 " + student8 + " 입니다.");

		System.out.print("9번째 학생의 이름을 입력해주세요");
		String student9 = sc.nextLine();
		System.out.println("9번째 학생의 이름은 " + student9 + " 입니다.");

		System.out.print("10번째 학생의 이름을 입력해주세요");
		String student10 = sc.nextLine();
		System.out.println("10번째 학생의 이름은 " + student10 + " 입니다.");

		System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다.");

		for (int i = 1; i <= 10; i++) { // 유지보수성이 좋다.
			System.out.println(i + "번째 학생의 이름을 입력하세요 : ");
			String student = sc.nextLine();
			System.out.println(i + "번째 학생의 이름은 " + student + " 입니다.");
		}

		System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다.");

	}

	public void testForExample2() {

		/*
		 * 1부터 10까지 누적해서 더한 값을 출력.
		 */

//			int num1 = 1;
//			int num2 = 2;
//			int num3 = 3;
//			int num4 = 4;
//			int num5 = 5;
//			int num6 = 6;
//			int num7 = 7;
//			int num8 = 8;
//			int num9 = 9;
//			int num10 = 10;
//			
//			int sum = 0;		//무언가를 누적해서 더하려면 0으로 초기화 곱하려면 1로 초기화시킨다. sum이라는 변수를 사용한다.
//		
//			sum += num1;
//			sum += num2;
//			sum += num3;
//			sum += num4;
//			sum += num5;
//			sum += num6;
//			sum += num7;
//			sum += num8;
//			sum += num9;
//			sum += num10;
//			
//			
//			System.out.println("sum : " + sum);

//			반복되지 않은 변수 sum을 0으로 초기화 해준것과 출력문은 반복되지 않는다.

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println("sum : " + sum);
		}

	}

	public void testForExample3() {

		/* 5 ~ 10사이의 난수를 발생시켜서 1부터 발생한 난수까지의 합계를 구하시오. */

		int random1 = (int) (Math.random() * 6) + 5;

		int sum = 0;

		if (random1 == 5) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
		} else if (random1 == 6) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
		} else if (random1 == 7) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
			sum += 7;
		} else if (random1 == 8) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
			sum += 7;
			sum += 8;
		} else if (random1 == 9) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
			sum += 7;
			sum += 8;
			sum += 9;
		} else if (random1 == 10) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
			sum += 7;
			sum += 8;
			sum += 9;
			sum += 10;
		}

		System.out.println("1부터 " + random1 + "까지의 합은" + sum);

		int sum2 = 0;

		for (int i = 1; i <= random1; i++) {
			sum2 += i;
		}

		System.out.println("1부터 " + random1 + "까지의 합은" + sum);

	}

	public void testForExample4() {

		/*
		 * 숫자 두 개를 입력 받아 작은 수 에서 큰 수까지 합계를 구하세요 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 하며, 처음
		 * 입력하는 숫자가 작은 값인지 큰 값인지는 모르는 상황이다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번 째 수를 입력받으세요 : ");
		int first = sc.nextInt();

		System.out.print("두번 째 수를 입력받으세요 : ");
		int second = sc.nextInt();

		// ------------------------------------------------------------

		int sum = 0;

		if (first > second) {
			for (int i = second; i <= first; i++) {
				sum += i;
			}
		} else {
			for (int i = first; i <= second; i++) {
				sum += i;
			}
		}

		System.out.println("sum : " + sum);

		// ----------------------------------------------------------------------

		int min = 0;
		int max = 0;

		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}

		int sum2 = 0;
		for (int i = min; i <= max; i++) {
			sum2 += i;
		}

		System.out.println("sum2 : " + sum2);

	}

	public void printSimpleGugudan() {

		/*
		 * 키보드로 2 ~ 9 사이의 단수를 입력받아 2 ~ 9 사이인 경우 해당 단의 구구단을 출력하고 그렇지 않은 경우 "반드시 2 ~ 9 사이의
		 * 양수를 입력해야 한다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {

//			System.out.println(dan + " * " + 1 + " = " + (dan * 1));
//			System.out.println(dan + " * " + 2 + " = " + (dan * 2));
//			System.out.println(dan + " * " + 3 + " = " + (dan * 3));
//			System.out.println(dan + " * " + 4 + " = " + (dan * 4));
//			System.out.println(dan + " * " + 5 + " = " + (dan * 5));
//			System.out.println(dan + " * " + 6 + " = " + (dan * 6));
//			System.out.println(dan + " * " + 7 + " = " + (dan * 7));
//			System.out.println(dan + " * " + 8 + " = " + (dan * 8));
//			System.out.println(dan + " * " + 9 + " = " + (dan * 9));
			
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
		} else {
			System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다.");
		}

		System.out.println("프로그램을 종료합니다.");

	}
	
}
