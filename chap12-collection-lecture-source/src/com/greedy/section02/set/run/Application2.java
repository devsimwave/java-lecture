package com.greedy.section02.set.run;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application2 {

	public static void main(String[] args) {
		
		/* LinkedHashSet 클래스
		 * HashSet이 가지는 기능을 모두 가지고 있다.
		 * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
		 * JDK 1.4 부터 제공하고 있다.
		 * */
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("java");
		linkedHashSet.add("oracle");
		linkedHashSet.add("jdbc");
		linkedHashSet.add("html");
		linkedHashSet.add("css");
		
		System.out.println("linkedHashSet : " + linkedHashSet);
		
		Set<String> treeSet = new TreeSet<>(linkedHashSet);
		System.out.println("treeSet : " + treeSet);
		
		
	}

}
