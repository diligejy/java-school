package com.test;

public class MTest {
	public static void main(String[] args) {

		String su = null;
		int a = 0;

		su = "10000000000";
		try {
			a = Integer.parseInt(su);
		} catch (NumberFormatException n) {
			System.out.println(" ����ó�� ���� : " + n.getMessage());
		} catch (IllegalArgumentException i) {

		} catch (RuntimeException r) {

		} catch (Exception e) {

		} finally {
			System.out.println("�ݵ�� �����ؾ� �ϴ� ��, DB, file ���� Close");
		}

		System.out.println("su = " + su);
		System.out.println("a = " + a);

	}
}
