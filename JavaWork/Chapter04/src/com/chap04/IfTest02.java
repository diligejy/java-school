package com.chap04;

import java.util.Scanner;

public class IfTest02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� :");
		int su = sc.nextInt();
		if((su % 2) == 0) {
			System.out.println(su + " �� ¦���Դϴ�.");
		} else {
			System.out.println(su + " �� Ȧ���Դϴ�.");
		}

	}

}
