package com.greedy.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {

		/* FileInputStream */
		
		FileInputStream fin = null; 		//io는 input과 output에 있는 패키지
		
		try {
			fin = new FileInputStream("src/com/greedy/section02/stream/testInputStream.txt");	//java.io.FileNotFoundException 지정된 파일을 찾을 수 없는 exception
			
//			System.out.println((char) fin.read()); 		//read()메소드 : 입력 스트림으로 부터 1바이트를 읽고 읽은 바이트를 리턴
//			System.out.println((char) fin.read());
//			System.out.println((char) fin.read());
//			System.out.println((char) fin.read());
//			System.out.println((char) fin.read());
//			System.out.println(fin.read()); 			//더이상 읽어올 파일이 없을 때 -1을 반환해준다.
			
			/* 1byte씩 읽어들이는 방법*/
//			int value;
//			while((value = fin.read()) != -1) {			// 메소드를 호출할 때마다 값을 불러와서 read메소드만 사용하게 된다면 값이 두 개만 출력된다 
//				System.out.println((char) value);
//			}
			
			/* byte 배열을 이용하는 방법*/
			System.out.println("파일의 길이 : "  + new File("src/com/greedy/section02/stream/testInputStream.txt").length());
			
			int fileSize = (int) new File("src/com/greedy/section02/stream/testInputStream.txt").length();
			byte[] bar = new byte[fileSize];
			
			fin.read(bar);
			
			for(int i = 0; i < bar.length; i++) {
				System.out.print((char) bar[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			/* 자원을 반납해야 하는 이우
			 * 1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 리소스에서 누수(leak)(낭비)가 발생한다.
			 * 2. 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야 한다.
			 * 	     만약 잔류 데이터가 남은 상황에서 추가로 스트림을 사용한다면 데드락(deadlock)상태가 된다.
			 *    판단하기 어렵고 의도하지 않은 상황에서도 이런 현상이 발생할 수 있기 때문에 마지막에 flush()를 무조건 실행해 주는 것이 좋다.
			 *    close() 메소드는 자원을 반납하며 flush()를 해주기 때문에 close()만 제대로 해 주어도 된다.
			 *    (메모리 낭비 측면에서 close() 메소드를 사용)
			 *    (stream을 사용하면 close() 사용하자)*/
			
			if(fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}




//FileInputStream
//- 파일로부터 바이트 단위로 읽을 때 사용하며, 그림, 오디오,비디오,텍스트 파일 등 모든 종류의 파일 읽기 가능
//- InputStream의 하위 클래스로 InputStream의 메소드를 그대로 사용 가능
//- FileInputStream 인스턴스 생성
//FileInputStream객체가 생성될 때 파일과 직접 연결
//만약 파일이 존재하지 않으면 FileNotFoundException이 발생하므로 예외처리 필수