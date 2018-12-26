package com.test;
// break; 반복문 선택문에서 키워드

// return; 메소드를 종료하는 키워드
// continue; 반복문에서 사용하는 키워드 

public class MTest {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				return;// 반복을 계속 수행하라
			} // end if
			System.out.println(i);
		} // end for
		System.out.println("================================================");
	}// end main
}// end class
