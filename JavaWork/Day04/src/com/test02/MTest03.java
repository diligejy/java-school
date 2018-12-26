package com.test02;


// 자바의 메소드 선언시 문법
// 1. 메소드 파라미터 변수에 초기값을 지정할 수 없다. public static void MTest(int a=0) { 같은 건 안됨
// 2. 리터럴은 메소드 호출시에 동일한 데이터 타입이 없으면 묵시형 형변환이 일어난다. 단 boolean은 제외된다.
// 3. 메소드에서 오버로드(overload)를 할 수 있다. 
// 오버로드 = 단일 클래스에서 동일한 이름의 메소드를  매개인자의 타입(*)이나 개수(*)를 다르게 선언하는 것 
// -> 왜 만드나? 메소드의 네임밸류때문.
// 
// 
// 

public class MTest03 {
	
	
	public static void MTest(int a) {
		System.out.println(a + "=> int");
	}
	
	public static void MTest(char a) { //4
		System.out.println(a + "=> char");
	}
	
	public static void MTest(char a, char b) { //4
		System.out.println(a + "=> char " + b);
	}
	
	public static void hap(int a, int b) {
		int res = a + b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		MTest('a');
		MTest(100);
		MTest('a', 'b');
		hap(1,2);
		
		
	}
}
