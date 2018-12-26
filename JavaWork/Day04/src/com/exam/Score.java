package com.exam;

//1. 세 과목을 받아서 총점을 구하는 메소드를 가지는 클래스 

public class Score {

	public static void Prn_tot(int k, int m, int e) {

		int tot = k + m + e;
		System.out.printf("  총점 : %3d\n", tot);

	}

	public static void Prn_avg(int k, int m, int e) {

		double avg = (double) (k + m + e) / 3;
		System.out.printf("  총점 : %5.1f\n", avg);
	}
}