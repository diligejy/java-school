package com.test01;

class Test {
	public int a, b;

	public Test() { // default ������
		a = 100;
		System.out.println("�� �⺻ �����ھ�");
	}



	public Test(int a) { // default ������
		this.a = a; // ���� object�� ��Ī�ϴ� ������ 
		System.out.println("�� �⺻ �����ھ�");
	}
}

public class MyTest03 {
	public static void main(String[] args) {
		Test t1 = new Test(); // public Test();
		System.out.println(t1);
		System.out.println(t1.a);
		
		Test t2 = new Test(4000);
		System.out.println(t2.a);
	}
}

