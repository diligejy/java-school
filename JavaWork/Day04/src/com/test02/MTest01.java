package com.test02;

public class MTest01 { // ��� �޼ҵ�
	public static void Prn_Name(String name) {
		System.out.printf(name + "�� �ȳ��ϼ���\n");
		
		
	}
	
	public static void main(String[] args) {
		// ex01) �̸��� �Է��ϸ� 000�� �ȳ��ϼ���  Prn_Name(String name)...
		
		Prn_Name("ȫ�浿"); // �޼ҵ带 ȣ���� �� full_name�� ������ ���� class�� static �޼ҵ带 ã�´�
		
		Prn_Name("���浿"); //
		
		// ex02) int a = 100; int b = a; ������ ���� ������ ���� �޼ҵ带 ȣ���Ѵ�.
		
		String name = "�̱浿";
		Prn_Name(name); // Prn_Name("�̱浿");
		
		
		
	}
}
