package com.greedy.section02.string;

public class Application4 {

	public static void main(String[] args) {

		/* 이스케이프 문자(escape sequence)
		 * 문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 사용하는 문자이다.
		 * 
		 * 이스케이프 문자 의미
		 * 	\n		   개행(줄바꿈)
		 *  \t		   탭
		 *  \'		   작은따옴표
		 *  \"        큰따옴표
		 *  \\ 		  역슬러쉬 */
	
		System.out.println("안녕하세요. \n 저는 홍길동입니다.");
		System.out.println("안녕하세요. \t 저는 홍길동입니다.");
		
		System.out.println("안녕하세요. 저는  '홍길동' 입니다.");
//		System.out.println(''');	//홑따옴표 문자와 문자 리터럴 기호가 중복됨
		System.out.println('\'');
	
//		System.out.println("안녕하세요. 저는 "홍길동"입니다.");
		System.out.println("안녕하세요. 저는\"홍길동\" 입니다.");
	
		System.out.println("안녕하세요. 저는 \\홍길동\\입니다.");
		
		/* split 시 이스케이프문자를 사용해야 한느 특수문자가 존재한다.
		 * 
		 * 이스케이프 문자를 사용하는 특수문자(정규표현식에 사용되는 문자이기 때문에 이스케이프를 이용해야 한다.)
		 * $ ^ * ( ) + | { } [ ] . ?
		 * 
		 * \\$
		 *  */
	
		String str = "java$oracle$jdbc";
		String[] sarr = str.split("\\$");
		
		for(String s : sarr) {
			System.out.println(s);
		}
	}

}
