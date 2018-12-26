package com.test;

import java.io.*;

public class FileTest05 {
	public static void main(String[] args) {
		File fi = new File("C:\\MyTest");
		View(fi);
	}
	public static int cnt = 0;
	public static void View(File fi) {
		
		System.out.println(cnt++ + "<========> " + fi.getName());
		if (fi.exists()) {
			for (File str : fi.listFiles()) {
				View(str);
				System.out.println(str);
			}
		}else
			return;
	}
}
