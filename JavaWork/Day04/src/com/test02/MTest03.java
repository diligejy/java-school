package com.test02;


// �ڹ��� �޼ҵ� ����� ����
// 1. �޼ҵ� �Ķ���� ������ �ʱⰪ�� ������ �� ����. public static void MTest(int a=0) { ���� �� �ȵ�
// 2. ���ͷ��� �޼ҵ� ȣ��ÿ� ������ ������ Ÿ���� ������ ������ ����ȯ�� �Ͼ��. �� boolean�� ���ܵȴ�.
// 3. �޼ҵ忡�� �����ε�(overload)�� �� �� �ִ�. 
// �����ε� = ���� Ŭ�������� ������ �̸��� �޼ҵ带  �Ű������� Ÿ��(*)�̳� ����(*)�� �ٸ��� �����ϴ� �� 
// -> �� ���峪? �޼ҵ��� ���ӹ������.
// 
// 
// 

public class MTest03 {
	
	
	public static void MTest(int a) {
		System.out.println(a + "=> int");
	}
	
	public static void MTest(char a) { //4
		System.out.println(a + "=> char");
	}
	
	public static void MTest(char a, char b) { //4
		System.out.println(a + "=> char " + b);
	}
	
	public static void hap(int a, int b) {
		int res = a + b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		MTest('a');
		MTest(100);
		MTest('a', 'b');
		hap(1,2);
		
		
	}
}
