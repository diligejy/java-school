package com.exam;

// 값을 받아 출력하는 메소드를 만들어보자.

public class Exam02 {
	public static void Prn_A(int a) {
	System.out.println(a);
	}
	public static void Prn_B(double a) {
		System.out.println(a);
	}
	public static void Prn_C(char a) {
		System.out.println(a);
	}
	public static void Prn_D(String a) {
		System.out.println(a);
	}
	public static void Prn_E(char a, String b) {
		System.out.println(a +","+ b);
	}
	public static void Prn_F(boolean a, boolean b) {
		System.out.println(a + "," + b );
	}
	public static void main(String[] args) {
		Prn_A(100);
		Prn_B(90.9);
		Prn_C('A');
		Prn_D("ABC");
		Prn_E('b', "abc");
		Prn_F(true, false);
	}
}
