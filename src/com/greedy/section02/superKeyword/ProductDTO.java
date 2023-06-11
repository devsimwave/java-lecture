package com.greedy.section02.superKeyword;

import java.util.Date;

public class ProductDTO {
	
	private String code;						// 상품코드
	private String brand;						// 제조사
	private String name;						// 상품명
	private int price;							// 가격
	private java.util.Date manufacturingDate;	//제조일자

	/* 기본생성자 */
	public ProductDTO() {
		System.out.println("ProductDTO 클래스의 기본생성자 호출됨...");
	}
	
	/* 모든 필드를 초기화하는 생성자*/
	public ProductDTO(String code, String brand, String name, int price, Date manufacturingDate) {
		super();
		this.code = code;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		
		System.out.println("ProductDTO 클래스의 모든 필드를 초기화하는 생성자 호출함...");
	}


	public String getCode() {
		return code;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public java.util.Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setManufacturingDate(java.util.Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	public String getInformation() {
		return "Product DTO [code =" + code 
				+ ", brand=" + brand
				+ ", name=" + name
				+ ", price=" + price
				+ ", manufacturingDate=" + manufacturingDate + "]";
				
				
				
	}
	
	
}
