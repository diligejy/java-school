package com.test;

public class MTest01 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int res = 0;
		a = 100;

		try {
			res = a / b;
			System.out.println("a = " + a + "b = " + b + "res = " + res);
		} catch (ArithmeticException n) {
			
			b = 50; // 코드처리한다
			res =  a / b;
			System.out.println("a =" + a + "    b = " + b + "    res = " + res);
		} finally {
			System.out.println("형아 왜그랭");
		}

	}
}
