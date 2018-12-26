package com.test;

public class WhileTest {

	public static void Prn() {

		// while 사용
		int a = 1;
		while (true) {

			if (a > 5) { // 1 > 5, 2 > 5, 4 > 5, 5 > 5, 6 > 5
				break;
			} // if end
			System.out.println(a++); // 1(2), 2(3), 3(4), 4(5), 5(6)
		} // while end
		System.out.println(" ---------------------------------------");
	}// method end

	public static void Prn02() {
		int a = 0;
		while (a < 5) {
			System.out.println(a++);

		}
		System.out.println("----------------------" + a);
	}

	public static void Prn03() {
		// 안녕하세요 3번 출력
		int a = 0;
		while (a++ < 3) {
			System.out.println("안녕하세요");

		}
	}

	public static void Prn04() {
		// 1~100까지 출력하자
		// 조건 1 : 2의 배수와 3의 배수만 출력하자
		// 조건 2 : 2의 배수와 3의 배수의 개수도 구하자

		int su = 1;
		int cnt = 0;

		while (su <= 100) {
			if ((su % 2 == 0) || (su % 3 == 0)) {
				System.out.printf("%5d\n", su);
				cnt++;
			}
			su++;
		}
		System.out.println("개수 :  " + cnt);
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
		System.out.println("합 : " + sum);

	}

	public static void Prn06() {
		// 1~100까지 출력해보자
		// 10단위일 때마다 줄바꿈 해보자
		int su = 1;
		String str = "♥";
		while (su <= 100) {
			{
				if (!(su % 10 != 0)) {
					System.out.printf("%4d", su);
				} else if (su % 10 == 0) {
					System.out.printf("%4d\n", su);
				} else if (su % 10 == 5) {
					System.out.printf("%4c", "♥");
				}

			}

		}
		su++;
	}

	public static void Prn07() {
		// 1에서 10까지 출력
		// 1+2+3+4+5+6+7+8+9+10 = 55 출력되게 하시오
		// (1+2) * (3+4) * (5+6) * ...

		int su = 1;
		int sum = 0;
		while (su <= 10) {
			sum += su;
			if (su % 10 == 0) {
				System.out.printf("%3d = %3d", su, sum);
			} else {
				System.out.printf("%3d +", su);
			}
			su++;

		}


	}

	public static void main(String[] args) {
		Prn07();

	}
}
