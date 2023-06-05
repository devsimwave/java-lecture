package com.greedy.section01.literal;

public class Application2 {

	public static void main(String[] args) {
		
		/* 값을 직접 연산하여 출력할 수 있다.*/
		/* 이 때 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.*/
		
		/* 1. 숫자와 숫자의 연산
		 * 1-1. 정수와 정수의 연산
		 * 수학적으로 사용하는 사칙 연산에 추가로 나머지를 구하는 연산(mod)을 사용할 수 있다.*/
		System.out.println("=========== 정수와 정수의 연산 ===========");
		System.out.println(123 + 456); // 연산자와 피연산자 사이는 한 칸을 띄우는게 우리 수업의 규칙(붙여서 써도 상관 없지만 가독성이 떨어짐.)
		System.out.println(123 - 23);
		System.out.println(123 * 10);
		System.out.println(123 / 10);
		System.out.println(123 % 10);  // 모드연산
	
		/*	1-2. 실수와 실수의 연산*/
		System.out.println("=========== 실수와 실수의 연산 ===========");
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.23);
		System.out.println(1.23 * 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 1.0);	// 실수 연산은 약간의 오차가 발생할 수 있음.
		
		/* 1-3. 정수와 실수의 연산*/
		System.out.println("=========== 정수와 실수의 연산 ===========");
		System.out.println(123 + 1.0); // 정수와 실수의 연산의 값은 실수의 값이 나온다.
		System.out.println(123 - 0.5);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);
	
		/* 2. 문자의 연산 
		 * 2-1. 문자와 문자의 연산*/
		System.out.println("=========== 문자와 문자의 연산 ===========");
		System.out.println('a' + 'b'); // 컴퓨터가 인식할 수 있게끔 미리 정의한다. (아스키코드) (아스키코드는 특수문자 영어 숫자 대문자 소문자밖에 없고 유니코드는 한글 등 여러 나라의 알파펫이 있다.) 
		System.out.println('a' - 'b');
		System.out.println('a' * 'b');		
		System.out.println('a' % 'b');		
	
		/* 2-2. 문자와 정수의 연산*/
		System.out.println("=========== 문자와 정수의 연산 ===========");
		System.out.println('a' + 1);
		System.out.println('a' - 1);
		System.out.println('a' * 2);
		System.out.println('a' / 2);
		System.out.println('a' % 2);
	
		/* 2-3. 문자와 실수의 연산*/
		System.out.println('a' + 1.0);
		System.out.println('a' - 1.0);
		System.out.println('a' * 2.0);
		System.out.println('a' / 2.0);
		System.out.println('a' % 2.0);
		
		/* 지금까지의 연산은 숫자끼리의 연산을 본 것이다.
		 * 숫자(정수 혹은 실수) 형태의 값은 수학의 사칙연산과 mod 연산이 전부 가능하다.
		 * */
		
		/* 3. 문자열의 연산
		 * 3-1. 문자열과 문자열의 연산
		 * 문자열과 문자열의 '+' 연산 결과는 문자열 합치기(이어 붙이기)가 된다.
		 * 문자열은 '+' 연산 외에 다른 연산을 사용하지 못한다.*/
		System.out.println("=========== 문자열과 문자열의 연산 ===========");
		System.out.println("hello" + "world"); // 문자열과 문자열의 연산의 값은 문자열을 합쳐 하나의 문자열을 만든다.
//		System.out.println("hello" - "world"); 컴파일 에러
//		System.out.println("hello" * "world"); 컴파일 에러
//		System.out.println("hello" / "world"); 컴파일 에러
//		System.out.println("hello" % "world"); 컴파일 에러
		
		/* 3-2. 문자열과 다른 형태의 값 연산
		 * 문자열의 연산은 무조건 덧셈밖에 안됨.*/
		System.out.println("=========== 문자열과 다른 형태의 값 연산 ===========");
		/* 3-2-1. 문자열과 정수의 연산*/
		System.out.println("helloworld" + 123);
		/* 3-2-1. 문자열과 실수의 연산*/
		System.out.println("helloworld" + 123.456);
		/* 3-2-1. 문자열과 문자와의 연산*/
		System.out.println("helloworld" + 'a');
		/* 3-2-1. 문자열과 논리의 연산*/
		System.out.println("helloworld" + true);
		
		/* 주의사항! : 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기 결과가 되는 것을 주의해야 한다. */
		System.out.println("=========== 문자열 형태의 숫자 값 '+' 연산 ===========");
		System.out.println("123" + "456");
		
		/* 4. 논리값 연산*/
		/* 4-1. 논리값과 논리값 연산 
		 * 논리값 끼리의 연산은 모든 연산자 사용이 불가능하다. */
//		System.out.println(true + false); 컴파일 에러
//		System.out.println(true - false); 컴파일 에러
//		System.out.println(true * false); 컴파일 에러
//		System.out.println(true / false); 컴파일 에러
//		System.out.println(true % false); 컴파일 에러

	
	
	}	

}
