package com.test;

import java.io.*;

public class FileTest04 {
	public static void main(String[] args) {
		File fi = new File("C:\\Windows\\System32");
		Prn(fi);
		Prn02(fi);

	}
	public static void Prn(File fi) {
		//public String[] list()
		System.out.println(" list () ");
		for(String m_list : fi.list()) {
			System.out.println(m_list);
		}
	}
	public static void Prn02(File fi) {
		//File[] listfiles() - Nonstatic 모두 가능
		System.out.println("   listFiles()   ");
		File[] res = fi.listFiles();
		for (File m_list : res) {
			if(m_list.isFile()) {
				System.out.println("Filename : " + m_list);
			}
			if(m_list.isDirectory()) {
				System.out.println("DirectoryName : " + m_list);
			}
		}
	}
}
