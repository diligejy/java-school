package com.test;
// char(2byte) 0 ~ 65535 한문자를 표시 ' '
public class MTest04 {
	public static void main(String[] args) {
		
		char ch = 100;
		System.out.println("ch="+ch);
		
		char ch02 = 'd';
		System.out.println("ch02="+ch02+100);
		
		char res = (char) (ch + ch02);
		System.out.println("res="+res);
		
	}
}
