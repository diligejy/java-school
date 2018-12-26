package com.test;

public class MTest01 {

	public static int getRes(){
		return 103; 
		/*
		 *  return 100, 100, 100; return; 이런 건 안됨
		 *  return (100+100); 이런 건 됨 1개의 결과값이니까! ㅎ
		 *  코드가 중요한 게 아니야~ return이 중요해 
		*/
	}

	public static float getF() {
		return 98.2f;
	}

	public static void main(String[] args) {
		int res = getRes();
		System.out.println(res);
		float f = getF();
		System.out.println(f);
		
		System.out.println(getRes());  
		// System.out.println(98); System.out.println(int);
		// float 'A'는 안됨 
		
		System.out.println(getRes() + " " + getF());
		
		float Result = getRes()+getF();
		System.out.println(Result);
	}
}
