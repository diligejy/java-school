package com.test;

public class MTest05 {
	
	public static void Prn(int su) {
		System.out.println("su를 2진으로 변경 : " + Integer.toBinaryString(su));
		System.out.println("su를 8진으로 변경 : " + Integer.toOctalString(su));
		System.out.println("su를 16진으로 변경 : " +Integer.toHexString(su) );
		
	}
	
	public static void main(String[] args) {
		Prn(100);
		System.out.println();
		Prn(478578783);
	}
}
