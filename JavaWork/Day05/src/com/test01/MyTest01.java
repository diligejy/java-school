package com.test01;
//ex) int a ; double d; => U_Test 나만의 DataType


class U_Test{
	
	public int a;
	public double d;
	
}

public class MyTest01 {
	public static void main(String[] args) {
		
		// non-static은 주소를 생성! 만들러 가즈아!
		// class명  클래스변수  
		   U_Test   um    = new U_Test();
	    // heap = new연산자를 만나면 동적으로 메모리 할당 후 실행이 끝나면 자동적으로 소멸되는 공간
		   System.out.println(um);
		   
		   um.a = 100;
		   um.d = 97.9;
		   System.out.println(um.a);
		   System.out.println(um.d);
		   um=null;
		   System.out.println(um);
		   
	}
	
	
}
