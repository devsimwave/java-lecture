package com.greedy.section01.polymorphism;

public class Application3 {

	public static void main(String[] args) {
		
		/* 매개변수와 다형성*/
		Application3 app3 = new Application3();
		
		Animal animal1 = new Rabbit();
		Animal animal2 = new Tiger();

		app3.feed(animal1);
		app3.feed(animal2);
		
		Rabbit animal3 = new Rabbit();
		Tiger animal4 = new Tiger();
		
		app3.feed((Animal) animal3);		//명시적 형변환	Animal타입으로 형변환 후 같은 타입으로 매개변수를 전달해야 된다.
		app3.feed((Animal) animal4);
		
		app3.feed(animal3); 				//묵시적 형변환 	
		app3.feed(animal4);
		
		app3.feed(new Rabbit()); 			//인스턴스변수값을 넘기나 인스턴스 변수를 생성하자 마자 넘길 수 있다. 묵시적 형변환이 적용된다.
		app3.feed(new Tiger());
	}

	public void feed(Animal animal) {		// 상위 타입으로 작성해주면 하위 타입은 작성안해줘도 된다.
		animal.eat();
	}
	
//	public void feed(Rabbit rabbit) {		// 다형성이 적용되지 않으면 오버로딩을 통해 다 메소드를 만들어야 되지만 다형성을 적용해서 하위 클래스 메소드는 안만들어줘도 된다.
//		rabbit.eat();
//	}
//	
//	public void feed(Tiger tiger) {
//		tiger.eat();
//	}
	
	
}
