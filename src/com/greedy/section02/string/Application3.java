package com.greedy.section02.string;

import java.util.StringTokenizer;

public class Application3 {

	public static void main(String[] args) {
		
		/* split()과 StringTokenizer
		 * 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
		 * split() : 정규표현식을 이용하여 문자열을 분리한다.
		 * 			 비정형화된 문자열을 분리할 때 좋지만 (공백문자 포함)
		 * 			정규표현식을 이용하여 속도가 느리다는 단점을 가진다.
		 * StringTokenzier : 문자열의 모든 문자를 구분자로 하여 문자열을 분리한다.
		 * 					 정형화된 문자열 패턴을 분리할 때 사용하기 좋다.(공백 문자열 무시(
		 * 					split()보다 속도 면에서 더 빠르다.
		 * 					구분자를 생략하는 경우 공백이 기본 구분자이다.
		 * */
		
		/*사번/이름/주소/부서를 의미한다.*/
		String emp1 = "100/홍길동/서울/영업부";
		String emp2 = "200/유관순//총무부";
		String emp3 = "300/이순신/경기도";
		
		String[] empArr1 = emp1.split("/"); 	//문자열 배열형태로 반환해줌.
		String[] empArr2 = emp2.split("/"); 	//문자열 배열형태로 반환해줌.
		String[] empArr3 = emp3.split("/"); 	//문자열 배열형태로 반환해줌.

		for(int i = 0; i < empArr1.length; i++) {
			System.out.println("empArr1[" + i + "] : " + empArr1[i]);
		}
		
		for(int i = 0; i < empArr2.length; i++) {
			System.out.println("empArr2[" + i + "] : " + empArr2[i]);	// 중간에 비어있으면 무시하진 않는다.
		}

		for(int i = 0; i < empArr3.length; i++) {
			System.out.println("empArr3[" + i + "] : " + empArr3[i]);	// 마지막 공백은 무시한다.
		}
		
		
		/* 마지막 구분자 사이에 값이 존재하지 않는 경우 이후 값도 추출하고 싶을 때
		 * 몇 개의 토큰으로 분리할 것인지 한계치를 두 번째 인자로 넣어준다.
		 * 이 때 음수를 넣게 되면 마지막 구분자 뒤의 값이 존재하지 않는 경우 빈 문자열로 토큰을 생성한다.*/
		
		String[] empArr4 = emp3.split("/", 3);	// 문자를 분리하는거(토큰)를 몇 개까지 분리할건지 사용하는것. 
		
		for(int i = 0; i < empArr4.length; i++) {
			System.out.println("empArr4[" + i + "] : " + empArr4[i]);
		}
		
		/* StringTokenizer 이용*/
		
		StringTokenizer st1 = new StringTokenizer(emp1, "/");
		StringTokenizer st2 = new StringTokenizer(emp2, "/");
		StringTokenizer st3 = new StringTokenizer(emp3, "/");
	
		while(st1.hasMoreTokens()) {
			System.out.println("st1 : " + st1.nextToken());
		}

		while(st2.hasMoreTokens()) {
			System.out.println("st2 : " + st2.nextToken());
		}

		while(st3.hasMoreTokens()) {
			System.out.println("st3 : " + st3.nextToken());
		}
	
		/* split()은 정규표현식(문자열 패턴)을 이용한다. 
		 * StringTokenizer는 구분자 문자열을 이용한다.
		 * */
		String colorStr = "red*orange#blue/yellow green";
		
		/* *#/ " 이라는 문자열이 구분자로 존재하지 않아서 에러 발생함.*/
//		String[] colors = colorStr.split("*#/ ");		//에러남
	
		String[] colors = colorStr.split("[*/# ]"); 	// 순서 상관 없음.
		
		for(int i = 0; i < colors.length; i++) {
			System.out.println("colors[" + i + "] : " + colors[i]);
		}
		
		StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr, "*/# ");	// 순서 상관 없음
		
		while(colorStringTokenizer.hasMoreTokens()) {
			System.out.println(colorStringTokenizer.nextToken());
		}
			
		
		
		
		
		
		
		
	
	}

}
