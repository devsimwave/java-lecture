package com.greedy.section02.extend;

public class WildCardFarm {

	public void anyType(RabbitFarm<?> farm) {	// 모든 타입 가능
		farm.getAnimal().cry();
		
	}
	
	public void extendsType(RabbitFarm<? extends Bunny> farm ) {	// Bunny와 Bunny의 자손 클래스만 가능
		farm.getAnimal().cry();
		
	}

	public void superType(RabbitFarm<? super Bunny> farm) {			// Bunny와 Bunny의 조상타입만 가능
		farm.getAnimal().cry();
	
	}
	
	
	
}
