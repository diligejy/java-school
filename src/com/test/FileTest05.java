package com.test;

import java.io.*;

public class FileTest05 {
	public static void main(String[] args) {
		File fi = new File("C:\\MyTest");
		View(fi);
	}

	public static void View(File fi) {
		int cnt = 0;
		System.out.println(cnt++ + "<========> " + fi.getName());
		if (fi.exists() && !fi.equals(null)) {//디렉토리 안에 디렉토리가 아닌 파일이 있는 경우 대비
			for (File str : fi.listFiles()) {
				View(str);
				System.out.println(str);
			}
		}else
			return;
	}
}
