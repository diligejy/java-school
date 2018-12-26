package com.test;

public class MTest03 {

	public static void Prn() throws Exception {
		throw new Exception();
	}

	public static void Prn02() throws Exception {
		Prn();
	}

	public static void main(String[] args) {
		try {
			Prn02();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
