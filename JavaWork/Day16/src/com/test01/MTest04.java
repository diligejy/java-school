package com.test01;

import com.test.Address;

public class MTest04 {

	public static void main(String[] args) {
		Address[] a1 = new Address[3]; 
		a1[0] = new Address("ȫ�浿", "����", "1111");
		a1[1] = new Address("�ֱ浿", "�λ�", "3333");
		a1[2] = new Address("�ֱ浿", "��õ", "4444");
		

		/*
		 * for (int i = 0; i < a1.length; i++) { System.out.println(a1[i]); }
		 */
		/*
		 * System.out.println("ȫ�浿�� �̱浿���� ���� �� ���"); a1[0].setName("�̱浿");
		 * System.out.println(a1[0]);
		 */ for (Address r : a1) {
			if (r instanceof Address) {
				if (r.getName().equals("ȫ�浿")) {
					r.setName("�̱浿");
				} // if
			} // if
			System.out.println(r);
		}// for 
	}
}
