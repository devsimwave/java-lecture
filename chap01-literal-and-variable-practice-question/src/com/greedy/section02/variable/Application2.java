package com.greedy.section02.variable;

public class Application2 {

	public static void main(String[] args) {
		
		/* 변수를 사용하기 위한 방법 
		 * 1. 변수를 준비한다. (선언)
		 * 2. 변수에 값을 대입한다. (값 대입 및 초기화)
		 * 3. 변수를 사용한다.
		 * */
		
		/*1. 변수를 준비한다. (선연) 
		 *1-1. 변수를 선언하는 방법
		 *자료형 변수명;
		 **/
		
		/* 자료형이란? 
		 * 다양한 값의 형태별로 어느 정도 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
		 * 예) int자료형은 정수를 4byte 크기만큼을 읽어서 하나의 값으로 취급하겠다는 약속이다.
		 * 이러한 자료형은 기본자료형 Primitive type)과 참조 자료형 (Reference type)으로 나누어진다.
		 * 직접 값을 보관하고 있는 변수 : 기본자료형
		 * 나머지 : 참조자료형
		 * 기본 자료형은 stack에 값이 저장 참조 자료형은 heap에 저장된 주소가 stack에 저장된다.
		 * */
		
		/* 1-1-1. 숫자를 취급하는 자료형
		 * 정수를 취급하는 자료형은 4가지가 있다.*/
		byte bnum; 		//1byte
		short snum;		//2byte
		int inum;		//4byte
		long lnum;		//8byte
		
		/* 실수를 취급하는 자료형은 2가지이다.*/
		float fnum;		//4byte
		double dnum; 	//8byte 
		
		/* 1-1-2. 문자를 취급하는 자료형 */
		char ch; 		//2byte;
		
		/* 1-1-3. 논리값을 취급하는 자료형*/
		boolean isTrue;	//1byte
		
		
		/* 1-1-4. 문자열을 취급하는 자료형*/
		String str; 	// 주소를 저장하는 자료형은 4byte
		
		/* 2. 변수에 값을 대입한다. (값 대입 및 초기화) 
		 * 2-1. 정수를 취급하는 자료형에 값 대입*/
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		/* 2-2. 실수를 취급하는 자료형(type)에 값 대입*/
		fnum = 4.0f;
		dnum = 8.0;
		
		/* 2-3. 문자를 취급하는 자료형에 값 대입*/
		ch = 'a';
		ch = 97;	//문자는 내부적으로 숫자로 저장이 되어있다.
		
		/* 2-4. 논리를 취급하는 자료형에 값 대입*/
		isTrue = true;	
		isTrue = false;
		
		/* 2-5.  문자열을 취급하는 자료형에 값 대입*/
		str = "안녕하세요";
		
		
		/* 3. 변수를 사용한다. 
		 * 3-1. 변수에 저장된 값 출력*/
		System.out.println("===== 변수에 저장된 값 출력 =====");
		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);
		
		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);
		
		System.out.println("ch의 값 : " + ch);
		
		System.out.println("isTrue의 값 : " + isTrue);
		
		
		System.out.println("str의 값 : "+ str);
		
		/* 3-2. 변수를 이용해서 연산하기*/
		int point = 100; 
		int bonus = 10;
		System.out.println("포인트와 보너스의 합은 : " + (point + bonus));
	
	
	}

}
