package com.test;

public class ARTest02 {
	public static char[] getChar_r (String str) {
		
		//공백을 제거한 문자열을 char[]로 리턴하자.
		//char [] r = str.replace(" ", "").toCharArray();
		
		char [] r = str.replace(" ", "").toUpperCase().toCharArray();
		
		/*String s = str.replace(" ", "");
		char [] r = s.toCharArray();*/
		return r;
	}
	
	public static void main(String[] args) {
		
		//주어진 문자열을 char[]로 출력을 하자. 
		// 단 주어진 메소드를 활용해서 구현을 한다
		// 1. 공백을 제거한 값을 리턴받는다.
		// 2. 공백을 제거한 값을 대문자로 리턴받자. 
		
		String str = "Converts this string to a new character array.\r\n";
		char [] res = getChar_r(str);
		for (char ch : res) {
			System.out.printf("%c,", ch);
		}
		/*System.out.println("ab c".replace(" ", ""));*/
		
	}
}
