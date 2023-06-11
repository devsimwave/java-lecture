package com.greedy.section03.dto;

public class MemberDTO {

	/* 회원 정보를 담을 수 있는 클래스를 추상화
	 * 회원번호, 회원명, 나이, 성별, 키, 몸무게, 회원탈퇴여부(활성화 여부)
	 *
	 * 
	 * DTO 클래스 작성 규칙(종합선물세트 느낌)
	 * 1. 모든 private 접근 제한
	 * 2. 모든 필드에 대한 설정자(setter)/접근자(getter)를 작성한다.
	 * 3. 기본 생성자와 모든 필드를 초기화하는 생성자를 작성한다.
	 * 4. 직렬화 처리한다.
	 * 5. toString() 메소드를 오버라이딩 하여 모든 필드 값을 반환한다.*/
	
	
	private int number;			//회원 번호
	private String name;		//회원명
	private int age;			//나이
	private char gender;		//성별
	private double height;		//키
	private double weight;		//몸무게
	private boolean isActivated; //회원탈퇴여부(활성화여부)

	/* 설정자(Setter)/접근자(Getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.
	 * 
	 * 설정자(Setter) 작성 규칙
	 * : 필드 값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
	 *   호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
	 *   
	 * [표현식] 
	 * public void set필드명(매개변수) {
	 * 		필드 = 매개변수;
	 * }
	 * 
	 * [작성예시]
	 * public void setName(String name) {
	 * 		this.name = name;
	 * 
	 * }
	 * 
	 * 접근자[getter] 작성규칙
	 *  : 필드의 값을 반환받을 목적의 메소드 집합을 의미한다.
	 *    각 접근자는 하나의 필드에만 접근하도록 한다.
	 *    필드에 접근해서 기록된 값을 return을 이용해 반환하며, 이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
	 *    
	 * [표현식]
	 * public 반환형 get필드명() {
	 * 		return 반환값;
	 * }
	 * 
	 * [작성 에시]
	 * public String getName() {
	 * 		return this.name;
	 * 
	 * }
	 * 
	 * */
	
	/* 설정자(setter) 메소드
	 * */

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setActivated(boolean isActivated) {			// boolean타입 같은 경우 is를 빼고 메소드를 작성함.(의문문이여서)
		this.isActivated = isActivated;
	}
	
	/*접근자(getter) 메소드*/
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public boolean isActivated() {
		return isActivated;
	}

}
