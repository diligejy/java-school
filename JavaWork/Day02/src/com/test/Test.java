package com.test;
// public 공개. protected 상속시 자손에게만 공개. default 같은  패키지에서만 공개, private 단일 클래스(this)란 공개
// this란? 현재 object를 지칭하는 연산자. 

/* import : 현재 클래스에서 외부에 작성된 클래스를 호출할 수 있도록 패키지.클래스를 선언하는 키워드 
 * 패키지 -> 자바 기본 import -> 사용자 작성 import
 * import를 하지 않아도 사용할 수 있는 자바의 패키지는  java.lang.* (자료형)들어있다잉 ㅋ 
 * 
 */
public class Test {
	// 프로그램 실행 시에 단일 진입점
	public static void main(String[] args) {
		System.out.println("abcd");
	}

}
