package com.test;
class MyTest{
	
	public static void Prn() {
		System.out.println("void��");
		
		
	}
}
public class MTest03{

	public static void main(String[] args) {
		//static�� �޼ҵ�� ����� ���ÿ� �ּҰ� �����ȴ�.
		//static�� ���� �޼ҵ�� ȣ���� �����Ӵ�
		//class��.�޼ҵ��();
		MyTest.Prn(); //void��
		
		
	}
}


public static void Prn(int a) {
	
	System.out.println(a);
	
}