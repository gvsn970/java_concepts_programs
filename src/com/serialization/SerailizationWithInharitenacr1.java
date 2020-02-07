package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal1{
	int i=10;
	public Animal1() {
	}
}class Dog1 extends Animal1 implements Serializable{
	int j=20;
}
public class SerailizationWithInharitenacr1 {

	public static void main(String[] args) throws Exception {
		Dog1 a1=new Dog1();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\nexii\\Desktop\\abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\nexii\\Desktop\\abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog1 d2=(Dog1)ois.readObject();
		System.out.println(d2.i+"   "+d2.j);
	}
}
