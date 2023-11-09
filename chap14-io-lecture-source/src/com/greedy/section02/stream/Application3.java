package com.greedy.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {

		/* FileOuputStream*/
		
		FileOutputStream fout = null;
		
		try {
			/* 출력용 스트림은 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.
			 * true는 이어쓰기, false는 덮어쓰기 (기본값 false)*/
			fout = new FileOutputStream("src/com/greedy/section02/stream/testOutputStream.txt",true);	//여기서 false값 넣을 시(이전에 쓴 내용들을 다 지우고 쓴다) 덮어쓰기 true값 넣을 시 이어쓰기(내용을 누적해서 사용)
			
			fout.write(97);
			
			byte[] bar = new byte[] {98, 99, 100, 101, 102, 10}; //10은 개행처리함
			fout.write(bar);
			
			/* 1번 인덱스부터 3의 길이만큼 파일에 내보내기*/
//			fout.write(bar, 1, 4);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}


//- 파일로부터 바이트 단위로 읽을 때 사용하며, 그림, 오디오,비디오,텍스트 파일 등 모든 종류의 파일 읽기 가능
//- OutputStream의 하위 클래스로 OutputStream의 메소드를 그대로 사용 가능
//- FileOutputStream 인스턴스 생성
//FileOutputStream객체가 생성될 때 파일과 직접 연결
//만약 파일이 존재하지 않으면 자동으로 생성하지만 이미 파일이 존재하는 경우 파일을 덮어쓰는 단점이 있음
//만일 기존 파일에 이어서 계속 추가 작성하고 싶다면 아래와 같이 작성
//ex) FileIOutputStream fis = new FileOutputStream("C:/data/test.txt");
//ex) FileIOutputStream fis = new FileOutputStream("C:/data/test.txt", true);
