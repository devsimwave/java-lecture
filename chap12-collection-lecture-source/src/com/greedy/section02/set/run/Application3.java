package com.greedy.section02.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {

	public static void main(String[] args) {
		
		/*TreeSet
		 * 데이터가 정렬된 상태로 저장되는 이진 검색 트리 형태로 요소를 저장한다.
		 * 이전 검색 트리는 데이터를 추가하거나 제거하는 등 기본 동작 시간이 빠르다.
		 * Set 인터페이스가 가지는 특징을 그대로 가지지만, 정렬된 상태를 유지하는 것이 차이점이다.
		 * JDK 1.2 부터 제공한다.*/
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("java");
		treeSet.add("oracle");
		treeSet.add("jdbc");
		treeSet.add("html");
		treeSet.add("css");
	
		System.out.println("treeSet : " + treeSet);
		
		Iterator<String> iter = treeSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().toUpperCase());
		}
		
		/* TreeSet을 이용한 중복되지 않은 로또 번호 생성*/
		
		Set<Integer> lotto = new TreeSet<>();
		
		int random = ((int)Math.random() * 46) + 1;
		
		while(lotto.size() < 6) {
			lotto.add(((int) (Math.random() * 45)) + 1);
		}
		
		System.out.println("lotto : " + lotto);
		
		
		
	}

}
