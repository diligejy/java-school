package com.test;

public class ARTest03 {
	
	// 문자열을 입력받은 View_Prn을 이용하여 소문자 개수 대문자 개수를 출력한다.
	public static void View_Prn(String str) {
		
		/*선생님이 만든 정답
		 * 
		 */
		char [] ch = str.toCharArray();
		int L_cnt = 0;
		int U_cnt = 0;
		for (char r : ch) {
			if(Character.isUpperCase(r)) {
				U_cnt++;
			}
			if(Character.isLowerCase(r)) { // else를 쓰지 않는게 포인트 ! else쓰면 점도 셈
				L_cnt++;
			}
		}
		
		System.out.println("대문자 : " + U_cnt + " 소문자 : " + L_cnt);
		
	}

	public static void main(String[] args) {
		String str = "Converts this string to a new character array.\r\n";
		View_Prn(str);
		
		//str의 전체 문자를 탐색하여야 한다.
		// 1. char[]로 리턴을 해서 char로 글자를 한 글자씩 탐색할 수 있어야 한다.
		// 2. 소문자일 경우 대문자일 경우 개수를 구하는 cnt 변수를 선언해서 카운트 한다.
		
	}
}
