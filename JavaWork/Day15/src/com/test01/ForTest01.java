package com.test01;

import java.util.Scanner;

public class ForTest01 {
	public static void view() {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= i+20; j+=5) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}//outer for
	}//end view

	public static void view02() {
		for (int i = 1; i <= 21; i+=5) {
			for (int j = i; j <= i+4; j++) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}//outer for
	}//end view

	public static void view03() {
		for (int i = 25; i >= 21; i--) {
			for (int j = i; j >= i-20; j-=5) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}//outer for
	}//end view

	public static void view04() {
		for (int i = 25; i >= 5; i-=5) {
			for (int j = i; j >= i - 4; j--) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}//outer for
	}//end view

	public static void main(String[] args) {
		int su = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("input su[1, 2, 3, 4] : ");
		su = sc.nextInt();
		switch (su) {
		case 1:
			view();
			break;
		case 2:
			view02();
			break;
		case 3:
			view03();
			break;
		case 4:
			view04();
			break;
		}
	}
}
