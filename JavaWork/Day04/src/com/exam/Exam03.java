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

public class Exam03 {
	public static void main(String[] args) {
		
		// 1. ������ Ÿ�� ����  2. ������  3. ����(����, ���), ���
		
		String name = "ȫ�浿";
		int kor = 100, mat = 78, eng = 82;
		int tot = 0; double avg=0.0;

		
		//avg = (double) tot / 3;
		System.out.printf("  �̸� : %3s\n", name);
		System.out.printf(" ���� :  %3d  ����: %3d  ����: %3d \n", kor, mat, eng);
		Score.Prn_tot(kor, mat, eng);
		Score.Prn_avg(kor, mat, eng);
		
	}
}
