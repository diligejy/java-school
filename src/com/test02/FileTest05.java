package com.test02;

import java.io.*;

public class FileTest05 {
	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
		oos.writeObject(new Address("111", "111", "111"));
		oos.writeObject(new Address("222", "222", "222"));
		oos.writeObject(new Address("333", "333", "333"));
		oos.close();
		ObjectInputStream iis = new ObjectInputStream(new FileInputStream("data.txt"));
		
		
		System.out.println(iis.readObject());
		System.out.println(iis.readObject());
		System.out.println(iis.readObject());
		iis.close();
	}
}
