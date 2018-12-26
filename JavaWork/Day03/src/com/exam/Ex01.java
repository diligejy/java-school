package com.exam;
/*
 * 
 * 
 * a = 100;
 * b = 200;
 * 
 * 100 + 200 = 
 * 200 - 100 = 
 * 100 * 200 = 
 * 200 / 100 = 
 * 
 * 
 * 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {

		// 1. 데이터 타입 선언
		// 2. 값 대입
		// 3. 연산
		// 4. 출력
		int a = 100, b = 200, hap = 0, sub = 0;
		int mul, div;
		mul=div=0;
		
		hap = a + b;
		sub = b - a;
		mul = a * b;
		div = b / a;
	
		
		
		System.out.printf("%5d +%5d = %5d\n", a, b, hap);
		System.out.printf("%5d - %5d = %5d\n", b, a, sub);
		System.out.printf("%3d * %3d = %3d\n", a, b, mul);
		System.out.printf("%5d / %5d = %5d\n", b, a, div);
		
		
		
	}

}
