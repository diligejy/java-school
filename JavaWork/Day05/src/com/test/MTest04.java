package com.test;
//API 제공하는 return형 static 메소드를 사용해보자

public class MTest04 {
	
	public static void main(String[] args) {

		
		// 1. Integer class를 사용해보자
		int su = 100; // int + Method() = Integer = java.lang
		
		//public static String toBinaryString(int i){return " ";}
		
		String str = Integer.toBinaryString(su);
		
		
		System.out.println("su를 2진으로 변경 : " + str);
		System.out.println("su를 8진으로 변경 : " + Integer.toOctalString(su));
		System.out.println("su를 16진으로 변경 : " +Integer.toHexString(su) );
		
		
	}
}
