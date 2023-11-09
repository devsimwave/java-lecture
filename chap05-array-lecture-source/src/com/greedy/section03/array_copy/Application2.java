package com.greedy.section03.array_copy;

public class Application2 {

	public static void main(String[] args) {

		/* 얕은 복사의 활용
		 * */

		String[] names = {"홍길동", "유관순", "이순신"};
		
		System.out.println("names의 hashcode : " + names.hashCode());
		
		print(names);
	
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		String[] animals = getAnimals();
		 
		System.out.println("리턴 받은 animals의 hashcode : " + animals.hashCode());
		
	}

	public static void print(String[] sarr) {
		
		System.out.println("sarr의 hashCode : " + sarr.hashCode());
		
		sarr[0] = "김진호";
		
		for(int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}
		System.out.println();

	}
	
	public static String[] getAnimals() {
		
		String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};
		
		System.out.println("새로 만든 animals의 hashCode : " + animals.hashCode());
		
		return animals;
		
	}
}
