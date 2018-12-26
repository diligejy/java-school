package com.test01;

@SuppressWarnings("rawtypes")
public class My implements Comparable {
	private String name;
	private int age;

	public My() {
		super();
		// TODO Auto-generated constructor stub
	}

	public My(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "My [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object obj) {
		
		My res = (My) obj; // ºñ±³ÇÒ °´Ã¼
		
		if (this.getName().compareTo(res.getName())>0) {
			return 1;
		}
		if (this.getName().compareTo(res.getName())<0) {
			return -1;
		}
		return 0;
	}

}
