package com.greedy.section04.wrapper;

public class Application2 {

	public static void main(String[] args) {
		
		/* parsing : 문자열(String) 값을 기본 자료형 값으로 변경하는 것을 parsing이라고 한다.*/
//		byte b = (byte) ("1".charAt(0) - 48);
//		
//		System.out.println(b + 1);
	
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("4");
		long l = Long.parseLong("8");			// long타입은 뒤에 L을 붙이는데 parsing은 숫자만 인식함. 그래서 L붙이면 에러 뜸.
		float f = Float.parseFloat("4.0f");		// 누가봐도 실수인 값만 넣는다. 4.0f는 됨.
		
//		"4.0" => 4		
		double d = Double.parseDouble("4.0");	// 이 부분만 다시 듣기
		int temp = (int) d;
		
		String str = "4.0";
		int temp2 = Integer.parseInt(str.substring(0, str.indexOf(".")));
		
		System.out.println(temp2);
		
		boolean bl = Boolean.parseBoolean("true");
		
		/* Character는 parsing 기능을 제공하지 않는다.*/
		char c = "abc".charAt(0);
		
		
	}

}
