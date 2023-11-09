package com.greedy.section02.extend;

public class RabbitFarm<T extends Rabbit> { 	// Rabbit 클래스의 후손 클래스만 받을 수 있게 제한을 검. 인테퍼이스든 클래스든 상관없이 extends 사용만 가능

	private T animal;
	
	public RabbitFarm() {}
	
	public RabbitFarm(T animal) {
		this.animal = animal;
	}
 	
	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
	public T getAnimal() {
		return this.animal;
	}
	
}
