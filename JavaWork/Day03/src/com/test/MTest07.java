package com.test;

public class MTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '\u0000';
		char end = '\uffff';
		System.out.println("ch="+(int)ch + "~" + (int)end);
		
		char f_name = '宋';
		System.out.println(f_name + " : " + (int)f_name);
		

		char a = '\uc1a1', b = '\uc9c4',  c= '\uc601', d='\n';
		
		System.out.printf("%c%c%c%c", a, d, b, c);
		
		String str = "\n\uc1a1\uc9c4\uc601";
		str = null;
		System.out.println(str);
		
		String str02 = null; // null: Object를 초기화 시켜줌
		str02 = "나는 오늘 감성지수 \"100%\"다 ";
		System.out.println(str02);
		
		
		
		
	}
	

}
