package com.test;

// byte practice : ����� ���ÿ� 1byte Ȯ��
public class MTest02 {
	public static void main(String[] args) {
		byte a = 100; // �޼ҵ� �ȿ� ����Ǵ� ������ ��������
		System.out.println(a);
		System.out.println("a="+a);
		a = 127; // 127�� ����� 
		System.out.println(a);
		a = (byte) 129; // 127�� ����� 
		System.out.println(a);
		
	}
}
