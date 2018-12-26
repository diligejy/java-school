package com.test;

public class DoTest {
	public static void Disp() {
		int su = 0;
		int sum = 0;
		do {
			System.out.println(su);
		
			sum = sum + su; // 0+1 1+2 3+3 6+4 10+5 15+6 21+7 28+8 36+9 45+10
			su++; // 1 2 3 4 5 6 7 8 45 55
			
		}while(su <=10);
		System.out.println("합 : " + sum);
	}
	public static void Prn05() {
		// 1에서 10까지 출력하고 합을 구하자

		int su = 0;
		int sum = 0;

		while (su <= 10) {
			System.out.println(su);

			sum = sum + su; // 0+1 1+2 3+3 6+4 10+5 15+6 21+7 28+8 36+9 45+10
			su++; // 1 2 3 4 5 6 7 8 45 55
		}
	

	}
	public static void Disp02() {

	}

	public static void main(String[] args) {
		Disp();
		
	}
}
