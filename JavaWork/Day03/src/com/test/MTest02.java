package com.test;

// byte practice : 선언과 동시에 1byte 확보
public class MTest02 {
	public static void main(String[] args) {
		byte a = 100; // 메소드 안에 선언되는 변수는 지역변수
		System.out.println(a);
		System.out.println("a="+a);
		a = 127; // 127로 재대입 
		System.out.println(a);
		a = (byte) 129; // 127로 재대입 
		System.out.println(a);
		
	}
}
