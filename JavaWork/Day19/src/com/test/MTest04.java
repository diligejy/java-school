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
		hs.add(null);// �츮�� �˰��ִ� null�� �ǹ̷ν� ���� �߰��ϴ� �� �ƴ϶� Value������ ����
		System.out.println(hs); // ������ ���ǹ��ϴٰ� ��
		
		
	}
}
