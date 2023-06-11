package com.greedy.section05.calendar;

import java.time.LocalDate;
import java.util.Date;

public class Application1 {

	public static void main(String[] args) {
		java.util.Date date;
		
		/* Date 클래스는 두 가지 생성 방법이 존재한다.*/
		/* 1. 기본 생성자로 사용하는 방법*/
		java.util.Date today = new java.util.Date();
		
		System.out.println(today);
		
		/* getTime() : 1970년 1월 1일 0시 0분 0초 이후로 지난 시간을 milliseconds로 계산해서 long 타입으로 반환한다.*/
		System.out.println(today.getTime());
		
		/* 2. Date(long data) 사용하는 방법*/
		java.util.Date time = new java.util.Date(today.getTime());
		
		System.out.println(time);
		
		
		/* 현재 날짜  문자열로 파싱하기*/
		LocalDate now = LocalDate.now();
		
		String y1 = Integer.toString(now.getYear()); 
		String m1 = Integer.toString(now.getMonthValue());
		
		System.out.println(y1);
		System.out.println(m1);
		
//		int year = now.getYear();
//		System.out.println("year : " + year);
//		
//		int month = now.getMonthValue();
//		System.out.println(month);
//		
//		String currentYear = Integer.toString(year);
//		
//		System.out.println(currentYear);
		
		
		
		
		
	}
}
