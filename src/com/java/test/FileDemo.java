package com.java.test;

import java.io.File;
import java.io.IOException;

/**
 * File类常见方法：
 * 
 * 文件能干吗？
 * 文件类可以被创建，如何去创建文件对象？
 * 
 * 	1.创建
 * 		createNewFile（） 如果没有创建成功，很可能会出现异常
 * 	2.删除
 * 		delete() 方法； 删除失败返回假，
 * 		deleteOnExit() 方法 ; 在程序退出时删除指定文件
 * 	3. 选择
 * 		
 * 	4.获取信息
 * 	
 * 	5.是否可执行
 * 	
 * */
public class FileDemo {

	public static void main(String[] args) throws IOException {
		//consMethods();
		method_2();
	}
	
	public static void consMethods() throws IOException{
		File f = new File("demo.txt");		
		//sop("是否创建文件成功? " + f.createNewFile());
		                                                                                                                                       sop("是否删除文件成功:" + f.delete());		
	}
	
	public static void method_2(){
		File f = new File("file.txt");
		sop("execute:" + f.canExecute());
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
