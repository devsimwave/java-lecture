package com.greedy.section03.map.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver"); 	//String 형태만 가능하다.
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1524:xe");
		prop.setProperty("user", "student");
		prop.setProperty("password", "student");
		
		System.out.println(prop); 	//toString() 오버라이딩 되서 저장된 값 나옴
		
		try {
			
			prop.store(new FileOutputStream("driver.txt"), "jdbc driver");
			prop.storeToXML(new FileOutputStream("drvier.xml"), "jdbc driver");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Properties prop2 = new Properties();
		
		System.out.println(prop2);
		
		String driver = prop2.getProperty("driver");
		String url = prop2.getProperty("url");
		String user = prop2.getProperty("user");
		String password = prop2.getProperty("paswsword");
		
		System.out.println("drvier : " + driver);
		System.out.println("url : " + url);
		System.out.println("user : " + user);
		System.out.println("password: " + driver);
		
		try {
//			prop2.load(new FileInputStream("driver.txt"));
			prop2.loadFromXML(new FileInputStream("driver.xml"));
			
			System.out.println(prop2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
