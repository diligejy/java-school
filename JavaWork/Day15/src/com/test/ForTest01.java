package com.test;
/*
 * 
 * 2 * 1 = 
 * 2 * 2 = 
 * 
 * 2 * 3 = 
 * 2 * 4 = 
 * 
 * 2 * 5 = 
 * 2 * 6 =
 * 
 * ...
 * 
 * 2 * 9 = 
 * 
 * 
 * 
 */

public class ForTest01 {
	public static void Exam() {
		int dan = 2;
		for (int i = 1; i <= 9; i++)
			
	}

	public static void Exam01(int n) {
		int dan = n;
		for (int i = 1; i <= 9; i++)
			System.out.println(dan + "*" + i + " = " + (dan * i));
	}

	public static void Exam03() {
		int dan = 2;
		for (int i = 1; i <= 9; i++) {
			if (!(i % 4 == 0)) {
				System.out.printf("%2d * %2d = %2d\t", dan, i, (dan * i));
			} else {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}// end if
		}// end for 
	}//end Exam03

	public static void main(String[] args) {
		Exam03();
	}
}
