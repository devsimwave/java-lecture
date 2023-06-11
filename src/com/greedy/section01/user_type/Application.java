package com.greedy.section01.user_type;

public class Application {

	public static void main(String[] args) {

		/* 회원정보(아이디, 비밀번호, 이름 , 나이, 셩별 , 취미)를 관리하려고 한다.*/
		
		String id = "user01";
		String pwd = "pass01";
		String name = "홍길동";
		int age = 20;
		char gender = '남';
		String[] hobby = new String[] {"축구", "볼링", "테니스"};
				
		System.out.println("id : " + id);
		System.out.println("pwd : " + pwd);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.print("hobby : ");

		for(int i = 0; i < hobby.length; i++) {
			System.out.print(hobby[i] + " ");
		}
		System.out.println();
	
	
		/* 사용자 정의의 자료형 사용하기 
		 * 1. 변수 선언 및 객체 생성
		 * 자료형 변수명 = new 클래스명();*/
		
		Member member = new Member();
		
		/* 2. 필드에 접근하기
		 * 필드에 접근하기 위해서는 레퍼런스변수명.필드명으로 접근한다.
		 * '.'은 참조 연산자라고 하는데, 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미를 가진다.
		 * 생성된 각 공간은 필드명으로 접근한다. (밸열은 인덱스로 접건, 객체는 필드명으로 접근
		 * */
		
		System.out.println("member.id : " + member.id);
		System.out.println("member.pwd : " + member.pwd);
		System.out.println("member.name : " + member.mane);
		System.out.println("member.age : " + member.age);
		System.out.println("member.gender : " + member.gender);
		System.out.println("member.hobby : " + member.hobby);
		
		
		/* 2. 필드에 값 대입 후 출력*/
		member.id = "user 01";
		member.pwd = "pass01";
		member.age = 20;
		member.gender = '남';
		member.hobby = new String[] {"축구", "볼링", "테니스"};
		
		System.out.println("변경 후 member.id : " + member.id);
		System.out.println("변경 후 member.pwd : " + member.pwd);
		System.out.println("변경 후 member.name : " + member.mane);
		System.out.println("변경 후 member.age : " + member.age);
		System.out.println("변경 후 member.gender : " + member.gender);
		System.out.print("변경 후 member.hobby : " );
		
		for(int i = 0; i < hobby.length; i++) {
			System.out.print(hobby[i] + " ");
		}
		
		
	
	
	}

}
