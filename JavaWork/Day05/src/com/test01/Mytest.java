package com.test01;

public class Mytest {
	public static int a; // Mytest의 멤버변수이면서 static이고 전역변수이다. 전역변수는 초기화할 필요가 없다잉 ㅎ
	
	public static void main(String[] args) {
		a = 3000;
		int a = 100;
		System.out.println(Mytest.a);
		System.out.println(a);
		// 지역변수가 있으면 지역변수가 우선, 아니면 전역변수. 분위기 조아 ~ 
		
		
	}
}
