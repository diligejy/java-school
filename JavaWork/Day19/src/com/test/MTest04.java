package com.test;
import java.util.*;

public class MTest04 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(100);
		hs.add(100);
		hs.add(10);
		hs.add(1);
		hs.add(110);
		hs.add(null);
		hs.add(null);// 우리가 알고있는 null의 의미로써 값을 추가하는 게 아니라 Value값으로 들어간다
		System.out.println(hs); // 정렬은 무의미하다고 함
		
		
	}
}
