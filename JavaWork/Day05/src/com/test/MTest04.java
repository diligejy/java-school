package com.test;
//API �����ϴ� return�� static �޼ҵ带 ����غ���

public class MTest04 {
	
	public static void main(String[] args) {

		
		// 1. Integer class�� ����غ���
		int su = 100; // int + Method() = Integer = java.lang
		
		//public static String toBinaryString(int i){return " ";}
		
		String str = Integer.toBinaryString(su);
		
		
		System.out.println("su�� 2������ ���� : " + str);
		System.out.println("su�� 8������ ���� : " + Integer.toOctalString(su));
		System.out.println("su�� 16������ ���� : " +Integer.toHexString(su) );
		
		
	}
}
