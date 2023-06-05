package com.greedy.section02.variable;

public class Application3 {

	public static void main(String[] args) {

		/* 1. 컴파일 에러를 발생시키는 규칙 
		 * 1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.*/
		int age = 20;
//		int age = 30; 컴파일 에러
		
		/* 1-2. 예약어는 사용이 불가능하다 */
//		int true;
	
		/* 1-3. 변수명은 대소문자를 구분한다. */
		int Age = 20;
		int True = 10;
		
		/* 1-4. 변수명은 숫자로 시작할 수 없다. */
//		int 1age = 10;
		int age2 = 10;
		
		/* 1-5. 특수기호는 '_'와  $만 사용 가능하다.*/
//		int sh@rp = 20;
		int _age = 20;
		int $harp = 20;
	
		/* 2. 컴파일 에러를 발생시키지 않지만 개발자들끼리의 암묵적인 규칙 */
		/* 2-1. 변수명의 길이 제한은 없다. 하지만 적당히 하자*/
		int dkfdjsklfjkdlsfjdksfjkdsajfds;
		
		/* 2-2. 변수명이 합성어로 이루어진 겨웅 첫 단어는 소문자, 두번째 시작하는 단어는 대문자로 시작한다.*/
		int maxAge = 20;
		int minAge = 10;
		
		/* 2-3. 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다.*/
		String user_name;	// 자바에서는 이렇게 하지 않는다.
		String userName;
		
		/* 2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지는 않는다.*/
		int 나이;
		
		/* 2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.*/
		String s;		//X
		String userId;	//O
		
		/* 2-5. 전형적인 변수 이름이 있다면 가급적이면 사용하도록 한다.*/
		int sum = 0;
		int max = 10;
		int min = 0;
		int count = 1;
		int cnt = 0; 		// count의 모음 부분을 빼고 약어를 만들었다.
		
		/* 2-6. 명사형으로 작성할 수 있도록 한다.*/
		String goHome;	//X
		String bird; // X고유명사는 가급적 쓰지 않도록 한다.
		
		/* 2-7. boolean 형은 의문문으로 가급적이면 긍정 형태로 작성한다. */
//		boolean isDead = false; 부정형 표현보다는 긍정형으로 작성한다.
		boolean isAlive = true;
	
	
	}

}
