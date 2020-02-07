package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender  {

	public static void main(String[] args) throws Exception{
		ServicalUID a1=new ServicalUID();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\nexii\\Desktop\\abc5.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
	}
}
