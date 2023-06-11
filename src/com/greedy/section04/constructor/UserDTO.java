package com.greedy.section04.constructor;

public class UserDTO {

	private String id;						//아이디
	private String pwd;						//비밀번호
	private String name;					//이름
	private java.util.Date enrollDate;		//가입일
	
	/* 생성자의 작성 위치(필드 메소드 사이에)
	 * 생성자의 사용 목적
	 * 1. 인스턴스를 생성하는 시점에 수행해야 할 명령이 있는 경우 사용한다.
	 * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화 하며 인스턴스를 생성할 목적으로 사용된다.
	 * 3. 작성한 생성자 외에는 인스턴스 생성하는 방법을 제공하지 않는다는 의미를 가진다.
	 *    인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수잇다. (초기값 전달 강제화)*/
	
	/* 생성자 작성 방법
	 * [표현식]
	 * 접근제한자 클래스명(매개변수) {
	 * 		인스턴스 생성 시점에 수행할 명령 기술(주로 필드를 초기화)
	 * 		this.필드명 = 매개변수;				//설정자(setter) 여러 개를 한 번에 호출하는 것과 비슷한 기능을 한다.
	 * }
	 * */
	
	/* 생성자 작성 시 주의할 사항
	 * 1. 생성자 메소드 이름은 반드시 클래스 이름과 동일해야함.(대/소문자까지 같아야함)
	 * 2. 생성자 메소드는 반환형을 작성하지 않는다. (작성하는 경우 생성자가 아닌 메소드로 인식한다.)*/
	
	/* 기본 생성자(default constructor)*/
	public UserDTO() {
		System.out.println("User DTO클래스의 기본 생성자 호출함...");
	}

	/* 동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능하다.*/
//	public UserDTO() {}
	 
	/* 매개변수 있는 생성자
	 * id, pwd, name의 초기화를 담당할 생성자*/
	public UserDTO(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		
		System.out.println("UserDTO 클래스의 id, pwd, name을 초기화하는 생성자 호출함");
	}
	
	/* 모든 필드를 초기화 할 생성자*/
	public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
//		this.id = id;
//		this.pwd= pwd;
//		this.name = name;
		
		this(id, pwd, name);// 첫번째로 작성 안해주면 에러코드남
		
		this.enrollDate = enrollDate;
		
		System.out.println("UserDTO 클래스의 모든 필드를 초기화하는 생성자 호출함...");
	}
	
	/* 복사 생성자
	 * 이미 만들어진 동일 타입의 인스턴스가 가지는 필드값을 이용해서 새로운 인스턴스 생성 시 초기값으로 이용할 수 있다.
	 * 동잉한 값을 가지지만 새롭게 할당되는 인스턴스이기에 서로 다른 주소값을 가진다. (깊은 복사용)
	 * */
	public UserDTO(UserDTO otherUser) {
		this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
		
		System.out.println("생성자 내의 this : " + this.hashCode());
		System.out.println("otherUser : " + otherUser.hashCode());
		
		System.out.println("UserDTO 클래스의 복사생성자 호출함...");
	}
	
	
	/* 한 번에 모든 필드 값을 합치기 하여 문자열로 변환하는 메소드*/
	public String getInformation() {
		return this.id + ", " + this.pwd + ", " + this.name + ", " + this.enrollDate;
	}




}
