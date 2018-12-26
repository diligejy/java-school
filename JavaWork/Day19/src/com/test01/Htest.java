package com.test01;

import java.util.*;

public class Htest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		hm.put(1, "일요일");
		hm.put(2, "월요일");
		hm.put(3, "화요일");
		hm.put(4, "수요일");
		hm.put(5, "수요일");
		hm.put(null, "토요일");
		hm.put(null, "토요일"); // Integer니까 null은 없다고 생각함
		hm.put(7, null);
		hm.put(8, null);
		System.out.println(hm);
		System.out.println("전체출력");
		// 키값만 출력
		Prn_Key(hm);
		// 값만 출력
		Prn_Value(hm);
		System.out.println("key 1이 있는지 확인" + hm.containsKey(1));
		System.out.println("key null이 있는지 확인 +" + hm.containsKey(null));
		System.out.println("Value 월요일이 있는지 확인" + hm.containsValue("월요일"));
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
