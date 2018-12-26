package com.test02;


//static, class : 선언과 동시에 주소가 생성된다. 무조건 ! 
//Math.PI   java.awt.Color => Color.BLUE : Field (Static final)

public class MTest04 {
	//공개    정적(선언과 동시에 주소 생성) 
	public static void Prn_All(String a, String b) {
		System.out.println(a + "은" + b +"에 근무합니다");
		}
	
	public static void main(String[] args) {
		String name = "홍길동";
		String addr = "서울시 서초구 엔코아..";
		
		Prn_All(name, addr);
	}

}
