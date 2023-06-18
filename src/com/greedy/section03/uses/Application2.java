package com.greedy.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {
		
		/* try-with-resource
		 * JDK 1.7에서 추가된 문법이다.
		 * close 해야 하는 인스턴스의 경우 (자원을 해제 해야 하는 경우) try 옆에 괄호 안에서 인스턴스를 생성하면
		 * 해당 try-catch블럭이 완료될 때 자동으로 close()를 처리해준다.*/
		
		try(BufferedReader in = new BufferedReader(new FileReader("test.dat"));) {
			
			String s;
			while((s = in.readLine())!= null ) {
				System.out.println(s);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
