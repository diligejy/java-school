package com.exam;

public class TvTest02 {
	public static void main(String[] args) {
		Tv tvArray[] = { new Tv("INFINIA", 1500000, "LED TV"), new Tv("XCANVAS", 1000000, "LCD TV"),
				new Tv("CINEMA", 2000000, "3D TV") };

		for (Tv r : tvArray) {
			// ���Ͽ� Tv�� �̸��� CINEMA��� ������ 4,000,000���� ��������
			if (r instanceof Tv) {
				if (r.getName().trim().equals("CINEMA")) {
					r.setPrice(4000000);

				} // if
				System.out.println(r);
			}//for
		}//main
	}//class
}
