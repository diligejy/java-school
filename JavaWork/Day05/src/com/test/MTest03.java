package com.test;
	


public class MTest03 {
	public static int getRes(){
		return 100;
	}
	
	
	public static int getRes(int a) {
		return a*2;
	}
	public static void main(String[] args) {

		int r = getRes();
		System.out.println(r);
		System.out.println(getRes());
		
		System.out.println(getRes(2));
		int r01 = getRes(2);
		System.out.println(101);
		
		int r02 = getRes(getRes()); // getRes(int a) = getRes(100)
		System.out.println(r02);
	}
}
