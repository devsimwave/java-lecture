package com.greedy.section01.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTest {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress localIP = InetAddress.getLocalHost();
		
		System.out.println(localIP.getHostAddress());
		
		InetAddress naverIP = InetAddress.getByName("www.naver.com");
		
		System.out.println("네이버 서버 ip : " + naverIP.getHostAddress());
	
		InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
		for(InetAddress ip : googleIPs) {
			System.out.println(ip.getHostAddress());
		}
		
	}

}
