package com.greedy.section00;

public class Item {

	private boolean isOn;
	private int random1;
	private int random2;
	private int swordLev;
	
	public void startGame() {
		if(isOn) {
			System.out.println("게임이 이미 실행중입니다.");
		} else {
			this.isOn = true;
			System.out.println("게임을 실행합니다.");
		}
	
	}

	public void reinforcement() {
		if(isOn) {
			random1 = (int) (Math.random() * 5) + 1;
			if(!(random1 == 5)) {
				swordLev++;
				System.out.println("강화를 성공하셨습니다." + this.swordLev + "만큼 강화되셨습니다.");
			} else {
				System.out.println("강화가 터졌습니다.");
				swordLev = 0;
			}
			
		} else {
			System.out.println("게임 샐행부터 시켜주세요.");
		}
		
	}
	
	public void speReinforce() {
		if(isOn) {
			random2 = (int) (Math.random() * 2) + 1;
			if(random2 == 1) {
				swordLev++;
				swordLev++;
				System.out.println("강화에 성공하셨습니다. " + this.swordLev + "만큼 강화되셨습니다.");
			} else {
				System.out.println("강화가 터졌습니다.");
			}
		
		} else {
			System.out.println("게임 샐행부터 시켜주세요.");
		}
			
	}
	
	
}