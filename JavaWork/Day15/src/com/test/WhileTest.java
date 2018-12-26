package com.test;

public class WhileTest {

	public static void Prn() {

		// while ���
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
		// �ȳ��ϼ��� 3�� ���
		int a = 0;
		while (a++ < 3) {
			System.out.println("�ȳ��ϼ���");

		}
	}

	public static void Prn04() {
		// 1~100���� �������
		// ���� 1 : 2�� ����� 3�� ����� �������
		// ���� 2 : 2�� ����� 3�� ����� ������ ������

		int su = 1;
		int cnt = 0;

		while (su <= 100) {
			if ((su % 2 == 0) || (su % 3 == 0)) {
				System.out.printf("%5d\n", su);
				cnt++;
			}
			su++;
		}
		System.out.println("���� :  " + cnt);
	}

	public static void Prn05() {
		// 1���� 10���� ����ϰ� ���� ������

		int su = 0;
		int sum = 0;

		while (su <= 10) {
			System.out.println(su);

			sum = sum + su; // 0+1 1+2 3+3 6+4 10+5 15+6 21+7 28+8 36+9 45+10
			su++; // 1 2 3 4 5 6 7 8 45 55
		}
		System.out.println("�� : " + sum);

	}

	public static void Prn06() {
		// 1~100���� ����غ���
		// 10������ ������ �ٹٲ� �غ���
		int su = 1;
		String str = "��";
		while (su <= 100) {
			{
				if (!(su % 10 != 0)) {
					System.out.printf("%4d", su);
				} else if (su % 10 == 0) {
					System.out.printf("%4d\n", su);
				} else if (su % 10 == 5) {
					System.out.printf("%4c", "��");
				}

			}

		}
		su++;
	}

	public static void Prn07() {
		// 1���� 10���� ���
		// 1+2+3+4+5+6+7+8+9+10 = 55 ��µǰ� �Ͻÿ�
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
