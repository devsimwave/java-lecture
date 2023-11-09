package com.greedy.section02.extend.run;

import com.greedy.section02.extend.Bunny;
import com.greedy.section02.extend.DrunkenBunny;
import com.greedy.section02.extend.Rabbit;
import com.greedy.section02.extend.RabbitFarm;
import com.greedy.section02.extend.WildCardFarm;

public class Application2 {

	public static void main(String[] args) {
		
		/* 와일드카드(WildCard)
		 * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때 그 객체의 타입변수에 제한을 걸 수 있다.
		 * 
		 * <?> 제한 없음
		 * <? extends Type> : 와일드 카드의 상한 제한 (Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능)
		 * <? super Type> : 와일드 카드 하한 제한 (Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)
		 * */
		
		WildCardFarm wildCardFarm = new WildCardFarm();
		
//		wildCardFarm.anyType(new RabbitFarm<Mammal>());
//		wildCardFarm.anyType(new RabbitFarm<Reptile>());
		
		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
//		wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Bunny()));
//		wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(DrunkenBunny)(new DrunkenBunny()));
	
	
	}

}
