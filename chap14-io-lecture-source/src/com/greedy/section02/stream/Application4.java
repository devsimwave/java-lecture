package com.greedy.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

	public static void main(String[] args) {

		/* FileWriter*/
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/com/greedy/section02/stream/testWriter.txt");
			
			fw.write(97);
			
			fw.write('A'); 				// 문자형 넘길 수 있음.
			
			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'}); 	//문자형 배열 넘길 수 있다.
			
			fw.write("우리나라 대한민국"); 					// 문자열 넘길 수 있다.
			
			
			
//			fw.flush(); 		//flush라는 것 정확하게 알기
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

//- 텍스트 파일에 Byte 단위가 아닌 character 단위로 출력
//(FileReader와 마찬가지로 글자 단위로 데이터를 처리)
//- FileOutputStream과 사용하는 방법이 거의 동일
//- Writer의 하위 클래스로 Writer의 메소드를 그대로 사용 가능
//- FileWriter 인스턴스 생성
//FileWriter객체가 생성될 때 파일과 직접 연결 됨
//만약 파일이 존재하지 않으면 자동으로 생성하지만 이미 파일이 존재하는 경우 파일을 덮어쓰는 단점이 있음
//만일 기존 파일에 이어서 계속 추가 작성하고 싶다면 아래와 같이 작성
//ex) FileWriter fw = new FileWriter("C:/data/test.txt");
//ex) FileWriter fw = new FileWriter("C:/data/test.txt", true);