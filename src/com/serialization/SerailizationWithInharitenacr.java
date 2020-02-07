package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable{
	int i=10;
	
}class Cat extends Animal{
	int j=20;
}
public class SerailizationWithInharitenacr {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cat a1=new Cat();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\nexii\\Desktop\\abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\nexii\\Desktop\\abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cat d2=(Cat)ois.readObject();
		System.out.println(d2.i+"   "+d2.j);
	}
}
