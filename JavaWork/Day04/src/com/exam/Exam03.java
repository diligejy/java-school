package com.exam;
/*
 * ex) 아래와 같이 출력하되 평균은 소수이하 한 자리만 출력해라
 * 이름 : 홍길동
 * 국어 : 100
 * 수학 : 78
 * 영어 : 81
 * 총점 :
 * 평균 : 
 * 
 */

public class Exam03 {
	public static void main(String[] args) {
		
		// 1. 데이터 타입 선언  2. 값대입  3. 연산(총점, 평균), 출력
		
		String name = "홍길동";
		int kor = 100, mat = 78, eng = 82;
		int tot = 0; double avg=0.0;

		
		//avg = (double) tot / 3;
		System.out.printf("  이름 : %3s\n", name);
		System.out.printf(" 국어 :  %3d  수학: %3d  영어: %3d \n", kor, mat, eng);
		Score.Prn_tot(kor, mat, eng);
		Score.Prn_avg(kor, mat, eng);
		
	}
}
