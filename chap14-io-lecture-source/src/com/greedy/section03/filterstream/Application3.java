package com.greedy.section03.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {
		
		/* DataInputStream/DataOutputStream */
		
		DataOutputStream dout = null;
		
		try {
			dout = new DataOutputStream(new FileOutputStream("src/com/greedy/section03/filterstream/score.txt"));
			
			dout.writeUTF("홍길동"); 
			dout.writeInt(95);
			dout.writeChar('A');

			dout.writeUTF("이순신");
			dout.writeInt(87);
			dout.writeChar('W');
			
			dout.writeUTF("김철수");
			dout.writeInt(73);
			dout.writeChar('C');
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(dout != null) {
				try {
					dout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		DataInputStream din = null;
		
		try {
			din = new DataInputStream(new FileInputStream("src/com/greedy/section03/filterstream/score.txt"));

//			System.out.println(din.readUTF()); 		// 내가 기록했던 순서대로 읽어와야함
// 			System.out.println(din.readInt());
//			System.out.println(din.readChar());
//		
//			System.out.println(din.readUTF()); 		
//			System.out.println(din.readInt());
//			System.out.println(din.readChar());
//			
//			System.out.println(din.readUTF()); 		
//			System.out.println(din.readInt());
//			System.out.println(din.readChar());
//
//			System.out.println(din.readUTF()); 		//EOFException : End Of File 더이상 실행할 파일이 없을 때?
//			System.out.println(din.readInt());
//			System.out.println(din.readChar());

			while(true) {
				System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료!");
		} catch(IOException e) {
			e.printStackTrace();	
		} finally {
			if(din != null) {
				try {
					din.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

			
		
		
		
		
	}

}
