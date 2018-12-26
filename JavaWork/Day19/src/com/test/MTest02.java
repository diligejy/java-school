package com.test;

import java.util.*;
import com.test.Score;

public class MTest02 {
	public static void main(String[] args) {
		Vector <Score> vm = new Vector<>();
		vm.add(new Score("ȫ�浿", 100, 100, 100));
		vm.add(new Score("���浿", 90, 90, 90));
		vm.add(new Score("�̱浿", 80, 80, 80));
		vm.add(new Score("�ֱ浿", 70, 70, 70));
		System.out.println("��ü ���");

/*		Prn(vm);*/
/*		System.out.println("1. ���浿�� �̸��� �ڱ浿���� �ٲپ� ��ü���");*//*
		Prn03(vm);
		Prn04(vm);
		Prn05(vm);
		Prn06(vm);*/
/*		System.out.println("2. �ֱ浿�� ���������� 100���� ���� �� ��ü���");
		System.out.println("3. �̱浿�� �ִ� ��ü�� ���������� 100���� ���� �� ���");
		System.out.println("4. �̱浿�� �̸��� ����ִ� ��ü�� �ε����� ������");*/
		vm.remove(0);
		Prn(vm);
		vm.set(1, new Score("�����", 90, 80,70));
		Prn(vm);
		
	}

	public static void Prn(List<Score> v) {
		System.out.println(" Case 1 : for ");
		for (Score sm : v) {
			System.out.println(sm);
		}
	}

	public static void Prn01(List<Score> rm) {
		System.out.println("Case 2 :for ");
		for (int i = 0; i < rm.size(); i++) {
			System.out.println(rm.get(i));
		}
	}

	public static void Prn02(List<Score> rm) { // ��ø�Ǿ��ִ� ��� ����ϸ� ����
		System.out.println("Case 3 : Iterator");
		Iterator<Score> res = rm.iterator();
		while (res.hasNext()) {

			System.out.println(res.next());

		}

	}

	public static void Prn03(Vector<Score> rm) {
		// ���浿�� �̸��� �ڱ浿���� �ٲپ� ��ü���
		System.out.println("1. ���浿�� �̸��� �ڱ浿���� �ٲپ� ��ü���");
		for (int i = 0; i < rm.size(); i++) {
			if (rm.get(i).getName().trim().equals("���浿")) {
				rm.get(i).setName("�ڱ浿");
				
			}
			System.out.println(rm.get(i));
		}

	}
	public static void Prn04(Vector<Score> rm) {
		// �ֱ浿�� ���������� 100���� ���� �� ��ü���
		for (int i = 0; i < rm.size(); i++) {
			if (rm.get(i).getName().trim().equals("�ֱ浿")) {
				rm.get(i).setKor(100);
			}
			
			System.out.println(rm.get(i));
		}

	}
	
	public static void Prn05(Vector<Score> rm) {
		// �̱浿�� �ִ� ��ü�� ���������� 100���� ���� �� ���
		for (int i = 0; i < rm.size(); i++) {
			if (rm.getName().trim().equals("���浿")) {
				rm.setName("�ڱ浿");
			}
			System.out.println(rm.get(i));
		}

	}
	
	public static void Prn06(Vector<Score> rm) {
		// �̱浿�� �̸��� ����ִ� ��ü�� �ε����� ������
		for (int i = 0; i < rm.size(); i++) {
			if (rm.getName().trim().equals("���浿")) {
				rm.setName("�ڱ浿");
			}
			System.out.println(rm.get(i));
		}

	}
}