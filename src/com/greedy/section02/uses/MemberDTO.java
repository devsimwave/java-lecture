package com.greedy.section02.uses;

public class MemberDTO {
	
	private int num;			//회원 번호
	private String id;			//회원 아이디
	private String pwd;			//회원 비밀번호
	private String name;		//회원 이름
	private int age;			//회원 나이
	private char gender;		//회원 성별
	
	/* 기본생성자*/
	public MemberDTO() {}
	
	/* 모든 필드를 초기화 하는 생성자*/
	public MemberDTO(int num, String id, String pwd, String name, int age, char gender) {
		this.num = num;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	
	public int getNum() {
		return num;
	}
	
	public String getId() {
		return id;
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
	
	public String getInformation() {
		return "MemberDTO [num=" + num
				+", id =" + id
				+", pwd =" + pwd
				+", name=" + name
				+", age=" + age
				+", gender=" + gender + "]";
	}
	
	

}

