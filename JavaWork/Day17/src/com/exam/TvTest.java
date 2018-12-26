package com.exam;

public class TvTest {
	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];

		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");

		/* for(Tv t1 : tvArray) {
			
		}*/
		
		// 3D TV일 경우에 LCD TV로 바꾸어라
		for (int i = 0; i < tvArray.length; i++) {
			if (tvArray[i].getDescription().trim().equals("3D TV")) {
				tvArray[i].setDescription("LCD TV");
			} // if
			System.out.println(tvArray[i]);
		}// for
	}//main
}//class
