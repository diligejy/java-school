package com.test;

import java.util.*;
import com.test.Score;

public class MTest05 {

	public static void main(String[] args) {
		Set<Score> hs = new HashSet<>();
		hs.add(new Score("111", 90, 90, 90));
		hs.add(new Score("222", 80, 80, 80));
		hs.add(new Score("333", 70, 70, 70));
		System.out.println(hs);
		Prn(hs);
		Prn01(hs);
		// "333의 이름을 홍길동으로 변경 후 전체 출력"
		// "222의 객체만 출력하라"
	}

	public static void Prn(Set<Score> sm) {
		System.out.println("case 1 : ");
		for (Score s : sm) {
			System.out.println(s);
		} // end for
	}// end Prn();

	public static void Prn01(Set<Score> sm) {
		System.out.println("Case 2 : ");
		Iterator<Score> res = sm.iterator();
		while (res.hasNext()) { // for (; r.hasNext();){}
			Score s = res.next();
			if (s.getName().trim().equals("222")) {
				s.setEng(30);
			}
			/* System.out.println(res.next()); */

		}
		System.out.println(res.hasNext() + " : " + sm.size());

		// end while
	}// end prn01()

	public static void Prn02(Set<Score> sm1) {
		// 333의 이름을 홍길동으로 변경 후 전체 출력
		for (Score sm1 : hs) {
			if (sm1.getName().trim().equals("333")) {

			}
		}

	}

}// end Mtest05
