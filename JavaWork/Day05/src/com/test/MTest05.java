package com.test;

public class MTest05 {
	
	public static void Prn(int su) {
		System.out.println("su�� 2������ ���� : " + Integer.toBinaryString(su));
		System.out.println("su�� 8������ ���� : " + Integer.toOctalString(su));
		System.out.println("su�� 16������ ���� : " +Integer.toHexString(su) );
		
	}
	
	public static void main(String[] args) {
		Prn(100);
		System.out.println();
		Prn(478578783);
	}
}
