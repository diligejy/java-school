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

		// ��� ��ü�� ���� ������ ���� ������ for Loop�� �̿��ؼ� ȭ�鿡 ����϶�.
		String stype = null;

		System.out.println("�⺻����");
		for (Shape s : shape) {
			if (s instanceof Triangle) {
				stype = "Triangle";
				System.out.printf("%10s %5.1f %s \n", stype, s.getArea(), s.getColors());
			} else {
				stype = "Rectangle";
				System.out.printf("%10s %5.1f %s \n", stype, s.getArea(), s.getColors());
			} // else

		} // for
		// ��� ��ü���� setResize �Լ��� �̿��Ͽ� 5�� �Է��ϰ� ����� ���� �� ȭ�鿡 ����Ѵ�. for Loop���� �̿��Ѵ�.
		System.out.println("����� ���� �� ����");
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
