
package com.greedy.section02.abstractclass;

public class Application {

	public static void main(String[] args) {
		
		/* 추상클래스와 추상메소드*/
//		Product product = new Product();		// 추상클래스는 인스턴스 생성 불가 이유는  추상클래스 내에는 아직 완성되지 않은 부분이 있어서 그렇다.
	
		/* 추상클래스를 이용하지는 못하고 상속받은 클래스를 이용한다.*/
		SmartPhone smartPhone = new SmartPhone();
		
		System.out.println(smartPhone instanceof SmartPhone);
		System.out.println(smartPhone instanceof Product);
	
		/* 다형성을 적용해서 레퍼런스 타입으로 활용할 수 있다.*/
		
		Product product = new SmartPhone();
		//타입은닉				//구현은닉

		product.abstmethod();
		product.abstmethod();
		
		product.nonStaticMethod();
		product.staticMethod();
	
//		product.printSmartPhone();  
		
		smartPhone.printSmartPhone();
		
		
		
	}


}
