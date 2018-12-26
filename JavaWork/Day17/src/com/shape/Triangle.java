package com.shape;

public class Triangle extends Shape implements Resize {

	public Triangle() {
		super();
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public double getArea() {

		return ((double)getHeight() * getWidth() / 2);

	}

	public void setResize(int size) {
		setHeight(getHeight() + size);

	}
}
