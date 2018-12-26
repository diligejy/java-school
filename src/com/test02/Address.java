package com.test02;

import java.io.Serializable;

public class Address implements Serializable {
	private String name;
	private transient String addr;
	private String tel;

	public Address() {
		super();
	}

	public Address(String name, String addr, String tel) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", addr=" + addr + ", tel=" + tel + "]";
	}

}
