package com.java.test;

import java.io.File;

public class CreateFileDemo {
	public static void main(String[] args) {
		CreateFile();
	}
	
	public static void CreateFile(){
		//将a.txt 封装成为对象
		File f1 = new File("C:\\abc\\a.txt");
		File f2 = new File("C:\\abc","b.txt");
		
		File dir = new File("c:"+File.separator+"abc");
		File f3 = new File(dir,"c.txt");
		
		sop("F1:" + f1);
		sop("F2:" + f2);
		sop("F3:" + f3);
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
