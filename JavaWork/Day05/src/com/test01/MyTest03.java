package com.test01;

class Test {
	public int a, b;

	public Test() { // default 생성자
		a = 100;
		System.out.println("나 기본 생성자야");
	}



	public Test(int a) { // default 생성자
		this.a = a; // 현재 object를 지칭하는 연산자 
		System.out.println("나 기본 생성자야");
	}
}

public class MyTest03 {
	public static void main(String[] args) {
		Test t1 = new Test(); // public Test();
		System.out.println(t1);
		System.out.println(t1.a);
		
		Test t2 = new Test(4000);
		System.out.println(t2.a);
	}
}

