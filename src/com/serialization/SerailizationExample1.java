package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int i=10;
	int j=20;
	 transient final int k=30;
	 final int a=10;
}
public class SerailizationExample1 {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog d1=new Dog();
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\nexii\\Desktop\\abc.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d1);
			
			
			FileInputStream fis=new FileInputStream("C:\\Users\\nexii\\Desktop\\abc.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Dog d2=(Dog)ois.readObject();
			System.out.println(d2.i+"   "+d2.j+"  "+d2.k+"  "+d2.a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
