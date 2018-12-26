package com.test01;

public class ForTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("\t"+j);
				
			} // inner for
		} // outer for
	}// main
}// class
