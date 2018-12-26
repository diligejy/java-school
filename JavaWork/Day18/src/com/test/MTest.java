package com.test;

public class MTest {
	public static void main(String[] args) {

		String su = null;
		int a = 0;

		su = "10000000000";
		try {
			a = Integer.parseInt(su);
		} catch (NumberFormatException n) {
			System.out.println(" 예외처리 내용 : " + n.getMessage());
		} catch (IllegalArgumentException i) {

		} catch (RuntimeException r) {

		} catch (Exception e) {

		} finally {
			System.out.println("반드시 실행해야 하는 것, DB, file 등의 Close");
		}

		System.out.println("su = " + su);
		System.out.println("a = " + a);

	}
}
