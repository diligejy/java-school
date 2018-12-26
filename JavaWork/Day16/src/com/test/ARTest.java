package com.test;

public class ARTest {

	public static void Test01() {

		// 자료형 [ ] 변수 = { , , , , ,}; 값의 갯수로 인덱스를 할당받고 요소의 크기가 정해짐
		int ar[] = { 10, 20, 30, 40 };
		// ar[0] ...
		System.out.println(ar + " : " + "요소의 크기 : " + ar.length);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	public static void Test02() {

		// 자료형 변수 [ ] = new 자료형 []{, , , , } 동적할당
		int[] ar = new int[] { 10, 20, 30, 40 };
		for (int i = 0; i < ar.length; i++) {
			ar[3] = 4000; // 값 변경
			System.out.println(ar[i]);
		}

	}

	public static void Test03() {
		// 자료형 변수 [ ] = new 자료형 [4];
		int[] ar = new int[4];
		ar[0] = 100;
		ar[3] = 20;
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	public static void Test04() {
		int ar[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.printf("%4d", ar[i]);
		}
	}

	public static void Test05() {
		int ar[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for (int res : ar) {{// 참조형
			
		
			System.out.printf("%5d", res);
		
	}
		}

	public static void main(String[] args) {
		Test05();
	}
}
