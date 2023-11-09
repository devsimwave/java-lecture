package com.greedy.section02.extend.run;

import com.greedy.section02.extend.Bunny;
import com.greedy.section02.extend.DrunkenBunny;
import com.greedy.section02.extend.Rabbit;
import com.greedy.section02.extend.RabbitFarm;

public class Application1 {

	public static void main(String[] args) {
		
//		RabbitFarm<Animal> farm1 = new RabbitFarm<>();	// 제한을 건 타입은 Rabbit 혹은 Rabbit 후손이기 때문에 상위 타입이나 관계 없는 타입은 컴파일 에러가 남
//		RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//		RabbitFarm<Snake> farm3 = new RabbitFarm<>();
		
		RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
		RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
		RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();
		
//		farm4.setAnimal(new Snake()); // 컴파일 시점에 Rabbit 타입으로만 가능하기 때문에
		
		farm4.setAnimal(new Rabbit());
		farm4.getAnimal().cry();
		
		farm5.setAnimal(new Bunny());
		farm5.getAnimal().cry();
		
		farm6.setAnimal(new DrunkenBunny());
		farm6.getAnimal().cry();
		
	
	}

}
