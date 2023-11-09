package com.greedy.section02.encapsulation.problem4;

public class Monster {

	private String kinds;			//private 해당 클래스 외에 어떤곳도 직접 접근 불가능
	private int hp;

	public void setKinds(String kinds) {
		this.kinds = kinds;
		
	}
	
	public void setHp(int hp) {
		if(hp > 0) {
			this.hp = hp;
		} else {
			this.hp = 0;
		}
	}

	public String getInfo() {
		
		return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
	}


}