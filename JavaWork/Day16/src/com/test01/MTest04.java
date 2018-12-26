package com.test01;

import com.test.Address;

public class MTest04 {

	public static void main(String[] args) {
		Address[] a1 = new Address[3]; 
		a1[0] = new Address("홍길동", "서울", "1111");
		a1[1] = new Address("최길동", "부산", "3333");
		a1[2] = new Address("최길동", "인천", "4444");
		

		/*
		 * for (int i = 0; i < a1.length; i++) { System.out.println(a1[i]); }
		 */
		/*
		 * System.out.println("홍길동을 이길동으로 변경 후 출력"); a1[0].setName("이길동");
		 * System.out.println(a1[0]);
		 */ for (Address r : a1) {
			if (r instanceof Address) {
				if (r.getName().equals("홍길동")) {
					r.setName("이길동");
				} // if
			} // if
			System.out.println(r);
		}// for 
	}
}
