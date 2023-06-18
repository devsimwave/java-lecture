package com.greedy.section03.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.greedy.section03.dto.MemberDTO;

public class Application4 {

	public static void main(String[] args) {

		MemberDTO[] outputMembers = { new MemberDTO("user01", "pass01", "홍길동 ", "hong777@greedy.com", 25, '남', 1250.7),
				new MemberDTO("user02", "pass02", "유관순 ", "korea31@greedy.com", 16, '여', 1221.6),
				new MemberDTO("user01", "pass01", "홍길동 ", "leesoonsin@greedy.com", 22, '남', 1234.6) };

		ObjectOutputStream objOut = null;

		try {
			objOut = new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("src/com/greedy/section03/filterstream/testObjectStream.txt")));

			for(int i = 0; i < outputMembers.length; i++) {
				objOut.writeObject(outputMembers[i]);
			}

			objOut.flush();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (objOut != null) {
				try {
					objOut.close();
				} catch (IOException e) {
					e.printStackTrace(); // 직렬화 처리해야 object 타입을 입출력이 가능하다.
				}
			}
		}

		
		
		MemberDTO[] inputMembers = new MemberDTO[3];
		ObjectInputStream objIn = null;

		try {
			objIn = new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream("src/com/greedy/section03/filterstream/testObjectStream.txt")));

			while (true) {
				System.out.println(objIn.readObject());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("끝");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (objIn != null) {
				try {
					objIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
