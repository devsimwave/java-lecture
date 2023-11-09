package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		
		/* ArrayList
		 * 가장 많이 사용되는 컬렉션 클래스이다.
		 * JDK 1.2부터 제공되고 있다.
		 * 내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열의 요소에 접근할 수 있다.
		 * */	
		
		/* ArrayLIst는 인스턴스를 생성하게 되면 내부적으로 10칸짜리 배열을 생성해서 관리한다.*/ 
		ArrayList alist = new ArrayList(); // 어레이리스트는 다른 클래스기 때문에 임포트 해줘야 한다.
		
		/* List 인터페이스 하위의 다양한 구현체들로 타입이 변경 가능하기 때문에
		 * 레퍼런스 타입은 List로 해두는 것이 더 유연하게 사용할 수 있다.
		 * 업캐스팅이고 타입 은닉이 일어난다. */
		List list = new ArrayList();
		
		
		/* Collection 타입을 이용할 수도 있다.
		 * Collection이 List 상위타입이다.
		 * */
		Collection clist = new ArrayList();
		
		/* ArrayList는 저장 순서가 유지되며 index(순번)이 적용된다.
		 * ArrayList는 object 클래스의 하위 타입 인스턴스를 모두 저장할 수있다.*/
		list.add("apple");
		list.add(123);	// autoBoxing 처리 됨. new Integer한 객체가 저장된거
		list.add(45.56);
		list.add(new java.util.Date());
		
		System.out.println("list : " + list);
	
		/* ArrayList의 크기는 size()메소드로 호환할 수 있다.
		 * 단, size()메소드는 배열의 크기가 아닌 요소의 갯수를 반환한다.*/
		System.out.println("list의 size : " + list.size());
		
		/* 인덱스에 해당하는 값을 가져올 때 get() 메소드를 이용한다. */
		for(int i  = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
	
		/* ArrayList는 데이터의 중복 저장을 허용한다.
		 * */
		list.add("apple");
		System.out.println("list : " + list);
		
		/* 원하는 인덱스 위치에 값을 추가할 수 있다.
		 * 값을 중간에 추가하는 경우 인덱스 위치에 값을 덮어쓰지 않고
		 * 새로운 값이 들어가는 인덱스 위치에 값을 넣고 이후 인덱스는 하나씩 뒤로 밀리게 된다.
		 * */
		list.add(1, "banana");
		System.out.println("list : " + list);
		
		list.remove(2);
		System.out.println("list : " + list);
		
		/* 지정된 위치의 값을 수정할 때도 인덱스를 활용할 수있으며 set() 메소드를 사용한다.*/
		list.set(1, new Boolean(true));
		System.out.println("list : " + list);
	
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");

		/* 제네릭 타입을 지정하면 지정한 타입 외의 인스턴스는 저장하지 못한다.*/
//		stringList.add(123);
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("mango");
		stringList.add("grape");
		
		System.out.println("StringList : " + stringList);
		
		/* Collections 인터페이스가 아닌 Collections 클래스이다.
		 * Collections에서 사용되는 기능을 static 메소드들로 구현한 클래스이며,
		 * 인터페이스명 뒤에 s가 붙은 클래스들은 관례상 비슷한 방식으로 작성된 클래스를 의미하게 된다.*/
		Collections.sort(stringList);
		
		System.out.println("stringListSort : " + stringList); 		// 정렬을 통해서 abcd순으로 나온다
	
		stringList = new LinkedList<>(stringList);
		
		/* Iterator란?
		 * Collection 인터페이스의 iterator() 메소드를 이용하여 인스턴스를 생성할 수 있다.
		 * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용되는 인터페이스이다.
		 * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위한 목록을 제공한다.
		 * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 인덱스로 요소에 하나씩 접근할 수 없기 때문에
		 * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 생각하면 된다.
		 * 
		 * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false 반환
		 * next() : 다음 요소를 반환
		 * */
			
		Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator(); //descending(내림차순 정렬) Iterator // 목록
		
		while(dIter.hasNext()) {
			System.out.println(dIter.next()); 
		}

		while(dIter.hasNext()) {
			System.out.println(dIter.next()); 	// 한번 꺼내간 목록을 재사용하는 건 안됨.
		}
		
		List<String> descList = new ArrayList<>(); 		// 값을 저장해놓고 사용하기 위해서 ArryList를 사용
		
		while(dIter.hasNext()) {
			descList.add(dIter.next());
			
		}
		
		System.out.println("decsList : " + descList);
	
	
	
	}

}
