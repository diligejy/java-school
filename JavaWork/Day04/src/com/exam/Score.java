package com.exam;

//1. �� ������ �޾Ƽ� ������ ���ϴ� �޼ҵ带 ������ Ŭ���� 

public class Score {

	public static void Prn_tot(int k, int m, int e) {

		int tot = k + m + e;
		System.out.printf("  ���� : %3d\n", tot);

	}

	public static void Prn_avg(int k, int m, int e) {

		double avg = (double) (k + m + e) / 3;
		System.out.printf("  ���� : %5.1f\n", avg);
	}
}