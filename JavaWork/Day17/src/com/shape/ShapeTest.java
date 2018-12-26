package com.shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");

		// 모든 객체의 넓이 정보와 색상 정보를 for Loop를 이용해서 화면에 출력하라.
		String stype = null;

		System.out.println("기본정보");
		for (Shape s : shape) {
			if (s instanceof Triangle) {
				stype = "Triangle";
				System.out.printf("%10s %5.1f %s \n", stype, s.getArea(), s.getColors());
			} else {
				stype = "Rectangle";
				System.out.printf("%10s %5.1f %s \n", stype, s.getArea(), s.getColors());
			} // else

		} // for
		// 모든 객체들을 setResize 함수를 이용하여 5를 입력하고 사이즈를 변경 후 화면에 출력한다. for Loop문을 이용한다.
		System.out.println("사이즈를 변경 후 정보");
		for (Shape s : shape) {
			if (s instanceof Triangle) {
				stype = "Triangle";
				((Triangle) s).setResize(5);
				System.out.printf("%-10s %5.1f %s \n", stype, s.getArea(), s.getColors());
			} else {
				stype = "Rectangle";
				((Rectangle)s).setResize(5);
				System.out.printf("%-10s %5.1f %s \n", stype, s.getArea(), s.getColors());
			} // else

		}
	}// main
	
}// class
