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
			
			b = 50; // �ڵ�ó���Ѵ�
			res =  a / b;
			System.out.println("a =" + a + "    b = " + b + "    res = " + res);
		} finally {
			System.out.println("���� �ֱ׷�");
		}

	}
}
