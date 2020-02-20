package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Receiver {

	public static void main(String[] args) throws Exception{
		ServicalUID a1=new ServicalUID();
		FileInputStream fis=new FileInputStream("C:\\Users\\nexii\\Desktop\\abc5.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ServicalUID a2=(ServicalUID)ois.readObject();
		System.out.println(a2.i+"   "+a2.j +"   "+a2.d);
	}
}
