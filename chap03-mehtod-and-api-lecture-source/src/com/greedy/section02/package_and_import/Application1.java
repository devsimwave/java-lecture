package com.greedy.section02.package_and_import;

import com.greedy.section01.method.Calculator;  	//ctrl + shift + o

public class Application1 {

	public static void main(String[] args) {
		
		/* 패키지와 임포트
		 * 같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름을 가진 클래스를 만들 수도 있다.
		 * 클래스명은 패키지명을 포함하고 있다. 예) com.greedy.section01.method.Calculator 
		 * 원래 클래스를 사용하기 위해서는 패키지명을 포함한 풀 클래스의 이름으로 사용해야 한다.*/
		
//		 com.greedy.section01.method.Calculator name = new com.greedy.section01.method.Calculator();
		 Calculator clac = new Calculator();
		 int min = clac.minNumberOf(30, 20);
		 
		 System.out.println("30과 20 중 더 작은 값은 : " + min);
		 
//		 int max = com.greedy.section01.method.Calculator.maxNumberOf(30, 20);
		 int max = Calculator.maxNumberOf(30, 20);
	}

}
