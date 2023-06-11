package com.greedy.section02.string;

public class Application2 {

	public static void main(String[] args) {
		
		/* 문자열 인스턴스를 만드는 방법
		 * 1. "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
		 * 2. 생성자 이용 new String("문자열") : 매번 새로운 인스턴스를 생성한다.
		 * */
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println("str1 == str2 : " + (str1 == str2));		//true
				
		System.out.println("str2 == str3 : " + (str2 == str3));	 	//false
		
		System.out.println("str3 == str4 : " + (str3 == str4));  	//false
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		
		/* equals() : String클래스의 equals() 메소드는 인스턴스 주소 비교가 아닌 문자열 값을 비교하여
		 * 동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를 반환하도록 Object 클래스의 equals() 메소드를 재정의 해 두었다.
		 * 따라서 문자열 인스턴스 생성 방식과 상관 없이 동일한 문자열인지를 판단할 때는
		 * == 연산 대신 equals() 메소드를 사용하는 것이 더 정확한 결과를 나타낼 수 있다.
		 * */
		
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		
		System.out.println("str1의 hashcode : " + str1.hashCode());
		System.out.println("str2의 hashcode : " + str2.hashCode());
		System.out.println("str3의 hashcode : " + str3.hashCode());
		System.out.println("str4의 hashcode : " + str4.hashCode());
		
		/* 문자열은 불변이라는 특성을 가진다.*/
		str2 += "oracle";
	
		System.out.println("str2 : " + str2);		// ex) java를 수정한게 아닌 oracle을 하나 다시 만드는 것이다. 매번 + 연산을 할 때마다 인스턴스가 새롭게 생성된다. 그래서 불변이라는 특성을 가지는 것이다.
	
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		String A = new String("PASS");
		String B = new String("PASS");
		String C = "PASS";
		
		System.out.println(A.equals(B));
		System.out.println(A == B);
		System.out.println(A.equals(C));
	
	}

}
