package com.exam;
/*
 * ex) �Ʒ��� ���� ����ϵ� ����� �Ҽ����� �� �ڸ��� ����ض�
 * �̸� : ȫ�浿
 * ���� : 100
 * ���� : 78
 * ���� : 81
 * ���� :
 * ��� : 
 * 
 */

public class Exam01 {
	public static void main(String[] args) {
		
		// 1. ������ Ÿ�� ����  2. ������  3. ����(����, ���), ���
		
		String name = "ȫ�浿";
		int kor = 100, mat = 78, eng = 82;
		int tot = 0; double avg=0.0;
		tot = kor + mat + eng;
		avg = (double) tot / 3;
		System.out.printf("  �̸� : %3s\n", name);
		System.out.printf(" ���� :  %3d  ����: %3d  ����: %3d \n", kor, mat, eng);
		System.out.printf("  ���� : %3d\n", kor);
		System.out.printf("  ���� : %3d\n", mat);
		System.out.printf("  ���� : %3d\n", eng);
		System.out.printf("  ���� : %3d\n", tot);
		System.out.printf("  ��� : %5.1f\n", avg);
		
	}
}
