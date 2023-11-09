package com.greedy.section04.dto;

public class UserDTO {

	/* 자바 빈(bean) 작성규칙
	 * 1. 자바 빈은 특정 패키지에 속해 있어야 함(default 패키지 사용금지)
	 * 2. 멤버변수(필드 == 전역변수 == 속성)의 접근 제어자는 private로 선언해야 함.
	 * 3. 기본생성자가 명시적으로 존재해야 한다. (매개변수 있는 생성자는 선택사항)
	 * 4. 멤버 변수에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성되어 있어야 함.
	 * 5. 직렬화 (Serializable 구현)가 되어 있어야 한다. (선택사항)
	 * 
	 * */
	
	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;
	
	public UserDTO() {}
	
	public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.enrollDate = enrollDate;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd ) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEnrollDate(java.util.Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}
	
	public String setName() {
		return name;
	}
	
	public java.util.Date getEnrollDate() {
		return enrollDate;
	}
	
	public String getInformation() {
		return "UserDTO [id =" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
	}



}
