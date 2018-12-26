package com.test01;

import java.util.*;
import java.util.Map.Entry;

import com.test.Address;

public class HTest01 {
	public static void main(String[] args) {
		HashMap<Integer, Address> hm = new HashMap<>();
		hm.put(1, new Address("111", "111", "111"));
		hm.put(2, new Address("222", "222", "222"));
		hm.put(3, new Address("333", "333", "333"));

		Prn_View(hm);
	}

	private static void Prn_View(HashMap<Integer, Address> hm) {
		// Set<Map.Entry<K,V>>
		Set<Entry<Integer, Address>> my_set = hm.entrySet();
		Iterator<Entry<Integer, Address>> e = my_set.iterator();
		while (e.hasNext()) {
			Entry<Integer, Address> f = e.next();
			System.out.println(f.getKey() + " : " + f.getValue());
		}
	}
}
/*
 * private static void Prn_Value(HashMap <Address> ir) { // Set<Map.Entry<K, V>>
 * Set
 */
