package com.greedy.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) { 	
			
			/* Reader : 문자 기반 입력 스트림의 최상위 클래스로 추상 클래스*/
		
		
//		    /* FileReader */ 	
	      
	      FileReader fr = null;
	      
	      try {
	         fr = new FileReader("src/com/greedy/section02/stream/testReader.txt");
	         
//	         int value;
//	         while((value = fr.read()) != -1) {
//	            System.out.print((char) value);
//	         }
	         /*char 배열 이용*/
	         char[] carr = new char[(int) new File("src/com/greedy/section02/stream/testReader.txt").length()];
	         
	         fr.read(carr);
	         for(int i = 0; i < carr.length; i++) {
	            System.out.print(carr[i]);
	         }
	         
	         
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }finally {
	         if(fr != null) {
	               try {
	                  fr.close();
	               } catch (IOException e) {
	                  e.printStackTrace();
	               }
	            }
	         }
	      }


}


//FileReader
//- 텍스트 파일로부터 Byte 단위가 아닌 character 단위로 읽어 들임
//(2바이트이던 3바이트이던 글자 단위로 읽어 오기 때문에 한글을 정상적으로 읽어올 수 있음)
//- FileInputStream과 사용하는 방법이 거의 동일
//- Reader의 하위 클래스로 Reader의 메소드를 그대로 사용 가능
//- FileReader 인스턴스 생성
//FileReader객체가 생성될 때 파일과 직접 연결 됨
//만약 파일이 존재하지 않으면 FileNotFoundException이 발생하므로 예외처리 필수






