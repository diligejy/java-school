package com.test;

public class MTest01 {

	public static int getRes(){
		return 103; 
		/*
		 *  return 100, 100, 100; return; �̷� �� �ȵ�
		 *  return (100+100); �̷� �� �� 1���� ������̴ϱ�! ��
		 *  �ڵ尡 �߿��� �� �ƴϾ�~ return�� �߿��� 
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
		// float 'A'�� �ȵ� 
		
		System.out.println(getRes() + " " + getF());
		
		float Result = getRes()+getF();
		System.out.println(Result);
	}
}
