package com.greedy.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application2 {

	public static void main(String[] args) {
		
		/* 형변환 보조 스트림
		/* InputStreamReader/OutPutStreamWriter
		 * 스캐너 클래스의 원형*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("문자열 입력 : ");
			String value = br.readLine();

			System.out.println("value : " + value);
		
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
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java oracle jdbc");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	
}

//형변환 보조 스트림
//- 기본 스트림이 byte 기반 스트림이고, 보조 스트림이 char 기반 스트림인 경우에 사용
//- System.in : 콘솔로부터 데이터를 입력 받음
//System.out : 콘솔로 데이터를 출력
//System.err : 콘솔로 데이터를 출력
//ex) BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//- System.in을 InputStreamReader로 변환하여 바이트기반 스트림을 문자 기반 스트림으로 변환 후 버퍼를 이용한
//보조스트림과 연결
//ex) BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));