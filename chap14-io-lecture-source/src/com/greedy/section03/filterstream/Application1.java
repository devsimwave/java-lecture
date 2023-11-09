package com.greedy.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {

		/* BufferedWirter/BufferedReader */
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("src/com/greedy/section03/filterstream/testBuffered.txt"));
		
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("src/com/greedy/section03/filterstream/testBuffered.txt"));
			
			/* readLine() : 버퍼의 한 줄을 읽어와서 문자열로 반환한다. */
			String temp;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}


//성능 향상 보조 스트림
//- 느린 속도로 인해 입출력 성능에 영향을 미치는 입출력 소스를 이용하는 경우 사용
//- 입출력 소스와 직접 작업하지 않고 버퍼에 데이터를 모아 한꺼번에 작업을 하여 실행 성능을 향상
//(입출력 횟수를 줄임) pdf 19페이지 참고
