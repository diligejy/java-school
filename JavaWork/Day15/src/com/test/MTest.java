package com.test;
// break; �ݺ��� ���ù����� Ű����

// return; �޼ҵ带 �����ϴ� Ű����
// continue; �ݺ������� ����ϴ� Ű���� 

public class MTest {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				return;// �ݺ��� ��� �����϶�
			} // end if
			System.out.println(i);
		} // end for
		System.out.println("================================================");
	}// end main
}// end class
