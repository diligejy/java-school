package com.test01;

import java.util.*;

public class Htest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		hm.put(1, "�Ͽ���");
		hm.put(2, "������");
		hm.put(3, "ȭ����");
		hm.put(4, "������");
		hm.put(5, "������");
		hm.put(null, "�����");
		hm.put(null, "�����"); // Integer�ϱ� null�� ���ٰ� ������
		hm.put(7, null);
		hm.put(8, null);
		System.out.println(hm);
		System.out.println("��ü���");
		// Ű���� ���
		Prn_Key(hm);
		// ���� ���
		Prn_Value(hm);
		System.out.println("key 1�� �ִ��� Ȯ��" + hm.containsKey(1));
		System.out.println("key null�� �ִ��� Ȯ�� +" + hm.containsKey(null));
		System.out.println("Value �������� �ִ��� Ȯ��" + hm.containsValue("������"));
		System.out.println();
	}

	public static void Prn(Map<Integer, String> rm) {
		System.out.println(" For Loop ");
		for (Integer key : rm.keySet()) {
			System.out.println(key + " => " + rm.get(key));

		}
	}

	public static void Prn_Key(Map<Integer, String> rm) {
		System.out.println();
		Set<Integer> res = rm.keySet();
		Iterator<Integer> ir = res.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}

	}
	
	public static void Prn_Value(Map<Integer, String> rm) {
		Collection<String> col = rm.values();
		Iterator<String> ir = col.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}
}
