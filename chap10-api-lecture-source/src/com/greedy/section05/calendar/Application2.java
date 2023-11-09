package com.greedy.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

	public static void main(String[] args) {
		
		/* Calendar
		 * abstract 클래스로 작성되어 있기 때문에 직접 인스턴스 생성이 불가능하다.
		 * 
		 * Calendar 클래스를 이용한 인스턴스 생성 방법
		 * 1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법
		 * 2. 후손클래스인 GregorianCalendar 클래스를 이용해서 인스턴스를 생성하는 방법
		 * */
		
		/* 1. getInstance()*/
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		
		/* 2. GregorianCalendar 이용
		 * 2-1. 기본생성자 사용*/
		Calendar gregroianCalendar = new GregorianCalendar();
		
		System.out.println(gregroianCalendar);
		
		/* 2-2. 년, 월, 일, 시, 분, 초 정보를 이용해서 인스턴스 생성
		 * 2014년 9월 18일 16:42:00 */
		int year = 2014;
		int month = 8;
		int dayOfMonth = 18;
		int hour = 16;
		int min = 42;
		int second = 0;
	
		Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
		System.out.println(birthDay);
		
		System.out.println(birthDay.getTimeInMillis());
		
		java.util.Date date = new java.util.Date(new GregorianCalendar(year, month, dayOfMonth, hour, min, second).getTimeInMillis());	// 밀리세컨드	//  시험문제
		
		System.out.println(date);
		
		int birthYear = birthDay.get(Calendar.YEAR); //1
		int birthMonth = birthDay.get(Calendar.MONTH) + 1; //2
		int birthDayOfMonth = birthDay.get(Calendar.DAY_OF_MONTH); //5
		int dayOfWeek = birthDay.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("birthYear : " + birthYear);
		System.out.println("birthMonth : " + birthMonth);
		System.out.println("birthDayofMonth : " + birthDayOfMonth);
		System.out.println("dayOfWeek : " + dayOfWeek);
		
		System.out.println(Calendar.YEAR);
		
		String weekName = "";
		switch(dayOfWeek) {
		case Calendar.SUNDAY : weekName = "일요일"; break;
		case Calendar.MONDAY : weekName = "월요일"; break;
		case Calendar.TUESDAY: weekName = "화요일"; break;
		case Calendar.WEDNESDAY : weekName = "수요일"; break;
		case Calendar.THURSDAY : weekName = "목요일"; break;
		case Calendar.FRIDAY : weekName = "금요일"; break;
		case Calendar.SATURDAY : weekName = "토요일"; break;
			
		}
		
		System.out.println("요일 : " + weekName);
		
		System.out.println("abpm : " + birthDay.get(Calendar.AM_PM));
	
		System.out.println(birthDay.get(Calendar.AM_PM) == Calendar.AM? "오전" : "오후");
		
		System.out.println("hourOfDay : " + birthDay.get(calendar.HOUR_OF_DAY));	//24시간 시간 체계
		System.out.println("hour : " + birthDay.get(Calendar.HOUR));				//12시간 시간 체계
	
		System.out.println("min : " + birthDay.get(Calendar.MINUTE));
		System.out.println("second : " + birthDay.get(Calendar.SECOND));
		
		/* 날짜 포맷을 쉽게 출력해주기 위한 용도의 클래스*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss (E)");
		String formatDate = sdf.format(date);
		
		System.out.println(formatDate);
		
		/* 나의 생일을 1998-04-16 오전 16:40:20 (?)의 출력 포맷으로 출력*/	// 다시 보기
		
		int year1 = 1998;
		int month1 = 3;
		int dayOfMonth1 = 16;
		int hour1 = 16;
		int min1 = 40;
		int second1 = 20;

		Calendar birthday1 = new GregorianCalendar(year1, month1, dayOfMonth1, hour1, min1, second1);
		
		System.out.println(birthday1);
		
		System.out.println(birthday1.getTimeInMillis());
		
		java.util.Date date1 = new java.util.Date(new GregorianCalendar(year1, month1, dayOfMonth1, hour1, min1, second1).getTimeInMillis());
		
		System.out.println(date1);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss (E)");
		String forDate = sdf1.format(date1);
		
		System.out.println(date1);
		
		
		
		
		
				
	}

}
