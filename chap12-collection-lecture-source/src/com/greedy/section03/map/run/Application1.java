package com.greedy.section03.map.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {

		/* Map 인터페이스의 특징
		 * Collection 인터페이스와 는 다른 저장 방식을 가진다.
		 * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
		 * 
		 * 키(key)란?
		 * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
		 * 
		 * 1. 요소의 저장 순서를 유지하지 않는다.
		 * 2. 키는 중복을 허용하지 않지만 키가 다르면 중복되는 값은 저장 가능하다.
		 * 
		 * HashMap
		 * JDK 1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색속도가 매우 빠르다.
		 * HashTable은 JDK 1.0부터 제공되었으며 HashMap과 동일하게 동작하지만 하위 호환을 위해 남겨놓았기 때문에
		 * 가급적이면 특별한 목적이 아닌 이상 HashMap을 사용하면 된다.
		 * */
		
		Map hmap = new HashMap();
		
		/* put() 메소드를 이용해 key와 value를 쌍으로 저장한다.*/
		hmap.put("one", new Date()); //hashmap에 값을 넣을 때 put메소드 사용
		hmap.put(12, "red apple");
		hmap.put(33, 123); 			//autoBoxing 처리되서 기본타입이 객체화 된거임.
		
		System.out.println("hmap : " + hmap);
		
		/* 키는 중복을 허용하지 않음(set방식)
		 * 동일한 key로 다시 저장하는 경우 기존 값을 덮어쓴다.*/
		hmap.put(12, "yellow banana");
		
		System.out.println("hmap : " + hmap);	// 동일한 키 값을 관리하지 않기 때문에 중복된 키의 값을 덮어씀.
	
		/* 값 객체는 중복 저장할 수 있음 (key값이 다른 경우)*/
		hmap.put(11, "yellow banana");
		hmap.put(9, "yellow banana");
	
		System.out.println("hmap : " + hmap);
		
		/* 값 객체의 내용을 가져올 때 get() 사용 가능하다.*/
		System.out.println("키 9에 대한 객체 : " + hmap.get(9));
		
		/* remove()를 이용해서 값을 삭제할 수 있다.*/
		hmap.remove(9);
		System.out.println("hmap : " + hmap);
		
		/* 저장된 객체 수 확인*/
		System.out.println("hmap에 저장된 객체 수 : " + hmap.size());
		
	
		
		Map<String, String> hmap2 = new HashMap<>();
		
		hmap2.put("one", "java 8");
		hmap2.put("two", "oracle 11g");
		hmap2.put("three", "jdbc");
		hmap2.put("four", "html5");
		hmap2.put("five", "css3");
		
		/* 1. keyset() 메소드 이용해서 키 값만 따로 set으로 만들고, 
		 * iterator()로 키에 대한 목록 만든 후 처리
		 * */
//		Set<String> keys = hmap2.keySet();
//		Iterator<String> keyIter = keys.iterator();
		
		
		Iterator<String> keyIter = hmap2.keySet().iterator(); // keyset() 키 값을 전부 다 갖고 오는것. 
		
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			String value = hmap2.get(key); //
			
			System.out.println(key + " = " + value);
		}
		
		/* 2. 저장된 value 객체들만 values()로 Collection 만들고 연속 처리*/
		Collection<String> values = hmap2.values();
		
		/* 2-1. iterator()로 목록 만들어서 처리*/
		Iterator<String> valueIter = values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
	
		/* 2-2. 배열로 만들어서 처리 */ 
		Object[] valueArr = values.toArray();
		for(int i = 0; i < valueArr.length; i++) {
			System.out.println(i + " : " + valueArr[i]);
		}

		/* 3. Map의 내부클래스인 EntrySet을 이용 : entrySet() */
		Set<Map.Entry<String, String>> set = hmap2.entrySet();		 
		
		Iterator<Map.Entry<String, String>> entryIter = set.iterator(); 
		while(entryIter.hasNext()) {
			Map.Entry<String, String> entry = entryIter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Map<String, Object> member = new HashMap<>(); 		//DTO를 대체 할 수 있지만 장,단점이 생긴다.
		member.put("number", 1);
		member.put("id", "user01");
		member.put("pwd", "pass01");
		member.put("name", "홍길동");
		member.put("age", 20);
		
		List<Map<String, Object>> memberList = new ArrayList<>();
		memberList.add(member);
		
		
	}

}
