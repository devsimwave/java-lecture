package com.greedy.section01.list.run;

import java.util.Stack;

public class Application4 {

	public static void main(String[] args) {
		
		/* Stack
		 * 스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
		 * 후입선출 (LIFO - Last Input First Out)방식의 자료구조라고 불린다.
		 * List 계열 클래스 중 Vector 클래스를 상속받아 구현되었다.
		 * */
		
		Stack<Integer> integerStack = new Stack<>();
		
		/* Stack에 값을 넣을 때는 push() 메소드를 이용한다.
		 * add()도 이용 가능하지만 Vector의 메소드이다.\
		 * */
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		integerStack.push(5);
		
		System.out.println(integerStack);
		
		/* 스택에서 요소를 찾을 때 search()를 이용할 수 있다.
		 * 인덱스가 아닌 위에서부터의 순번을 반환한다.
		 * 가장 상단의 위치는 1부터 시작하여 아래로 갈 수록 1씩 증가한다.
		 * */
		System.out.println(integerStack.search(5));
		
		/* stack에서 값을 꺼내는 메소드는 2가지 이다.
		 * peek() : 해당 스택의 가장 마지막에 있는 (상단에 있는) 요소 반환
		 * pop() : 해당 스택의 가장 마지막에 있는 (상단에 있는) 요소 반환 후 제거
		 * */
	
		System.out.println("peek() : " + integerStack.peek());
		System.out.println(integerStack);

		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
//		System.out.println("pop() : " + integerStack.pop()); 	//EmptyStackException 발생
		System.out.println(integerStack);
	
	
	}

}
