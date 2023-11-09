package com.greedy.section01.object.book.model.vo;

public class BookVO {

	private int number;
	private String title;
	private String author;
	private int price;
	
	public BookVO() {}

	
	public BookVO(int number, String title, String author, int price) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}


	public int getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {	// 이 부분 다시 들어보기 그 전에 동적바인딩이라는 개념을 알아야함.
		return "BookVO [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) { 	//equals는 Object 하위 메소드다. 동일성 판단
		
		/* 두 인스턴스의 주소가 같으면 이후 다른 내용을 비교할 것 없이 true를 반환한다.*/
		if(this == obj) {
			return true;
		}
		
		/* this는 인스턴스가 생성되면 주소값이 저장된다. null일 수 없다.
		 * 따라서 전달받은 레퍼런스 변수에 null값이 저장되어 있다면
		 * 비교하려는 두 개의 인스턴스는 서로 다른 인스턴스이다.*/
		if(obj == null) {
			return false;
		}
		 
		if(obj instanceof BookVO) {			
			BookVO other = (BookVO) obj;
			
			/* number 필드의 값이 서로 같지 않으면 서로 다른 인스턴스이다.*/
			if(this.number != other.number) {
				return false;
			}
			
			/* title 필드의 값이 null인 경우
			 * 매개변수로 전달 받은 인스턴스의 title 필드에도 null이 저장되어 있어야 서로 같은 값을 가진다.\
			 * 그렇지 않은 경우에는 서로 다른 인스턴스이다.
			 * */
			if(this.title == null) {
				/* title 필드가  null인 경우 다른 인스턴스의  title이 null 이 아니면 ,false*/
				if(other.title != null) {
					return false;
				}
			} else {
				/* String 클래스의 equals()는 이미 두 개의 문자열 값이 길이와 모든 인덱스 값이 같은 경우 true를 반환하도록 오버라이딩 되어 있다.*/
				if(this.title.equals(other.title) ) {
					return false;
				}
			}
			
			
			/* author 필드값 비교*/
			if(this.author == null) {
				if(other.author != null) {
					return false;
				}
			} else {
				if(!this.author.equals(other.author));
					return false;
			}
			
			
			/* price 필드값 비교*/
			if(this.price != other.price) {
				return false;
			}
			
			
			
		} else {
			return false;
		}
		
		
		return true;
	}

	@Override
	public int hashCode()
	{
		int result = 1;
		
		final int PRIME = 311;
		
		result = PRIME * result + this.number;
		result = PRIME * result + this.title.hashCode();
		result = PRIME * result + this.author.hashCode();
		result = PRIME * result + this.price;
		
		
				
		return result;
	}


}
