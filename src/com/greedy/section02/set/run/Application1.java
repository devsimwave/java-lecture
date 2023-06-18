package com.greedy.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {

		/* Set 인터페이스의 특징
		 * 1. 요소의 저장 순서를 유지 하지 않는다.
		 * 2. 같은 요소의 중복 저장을 허용하지 않는다. (Null값도 중복되지 않게 하나의 null만을 저장한다.)
		 * */
		
		/* HashSet*/
		Set<String> hset = new HashSet<>(); //HashSet<>() 검색이 빨라서 사용한다.
		
		hset.add(new String("java"));
		hset.add(new String("oracle"));
		hset.add(new String("jdbc"));
		hset.add(new String("html"));
		hset.add(new String("css"));
		
		System.out.println("hset : " + hset);
	
		System.out.println("hset의 size() : " + hset.size());
		
		/* 중복 허용 안함*/
		hset.add(new String("java"));
		System.out.println("hset : " + hset);
		System.out.println("hset의 size() : " + hset.size());
	
		System.out.println("포함확인 : " + hset.contains(new String("oracle")));
		
		/* 반복문을 이용해서 연속처리하는 방법(Set 인터페이스는 요소가 없어서)
		 * 1. toArray() 배열로 바꾸고 for문 이용*/
		Object[] arr = hset.toArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		/* 2. iterator()로 목록 만들어서 연속 처리*/
		Iterator<String> iter = hset.iterator();	// 깊은 복사를 이용해서 반복문을 사용하는거라 원본에 문제 가지 않음.
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("hset : " + hset);
		hset.clear();
		System.out.println("empty? : " + hset.isEmpty());
	
		
	
	}

}
