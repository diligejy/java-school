package com.test;

public class ForTest {
	public static void Prn() {
		// 1~10까지 출력
		int su = 0;
		for (su = 10; su > 0; su--) {
			System.out.printf("%3d", su);
		}

		// 10에서 1까지 출력
	}

	public static void Prn02() {
		for (int su = 2; su <= 10; su+=2) {
			System.out.printf("%3d", su);
		}

	}

	public static void Prn03() {
		for (int su = 5; (su <= 100)  ; su+=5) {
				
				System.out.printf("%3d", su);
		}
	}

	public static int Prn04(int a, int b) {
		int sum = 0;
		for (int i =a; i <= b; i++) {
			sum += i;
			System.out.printf(i + " : " + sum);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int hap = Prn04(1,10);
		System.out.println(hap);
		hap = Prn04(4, 200);
		System.out.println(hap);
	}
}
