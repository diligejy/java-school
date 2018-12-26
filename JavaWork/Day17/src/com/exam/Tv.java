package com.exam;

public class Tv {
	private String name;
	private int price;
	private String description;

	public Tv() {
		super();
	}

	public Tv(String name, int price, String description) {
		this.name = name; //super도 this도 첫줄에 쓰려고 함 +_+
		this.price = price;
		this.description = description;
	}

	@Override
	public String toString() {
		String str = String.format("%-5s %5d %s\n",  this.name, this.price, this.description);
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
