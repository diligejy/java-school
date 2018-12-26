package com.test;
class MyTest{
	
	public static void Prn() {
		System.out.println("void형");
		
		
	}
}
public class MTest03{

	public static void main(String[] args) {
		//static형 메소드는 선언과 동시에 주소가 생성된다.
		//static형 간의 메소드는 호출이 자유롭다
		//class명.메소드명();
		MyTest.Prn(); //void형
		
		
	}
}


public static void Prn(int a) {
	
	System.out.println(a);
	
}