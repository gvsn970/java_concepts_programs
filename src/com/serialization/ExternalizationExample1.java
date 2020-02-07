package com.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Carona implements Externalizable {
	int i;
	String s;
	int j;

	public Carona() {
		super();
	}

	public Carona(int i, String s, int j) {
		super();
		this.i = i;
		this.s = s;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeObject(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		String s1 = (String) in.readObject();
		s = s1;
		i = (int) in.readObject();
	}

}

public class ExternalizationExample1 {

	public static void main(String[] args) throws Exception {
		Carona d1 = new Carona(10, "surya", 20);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\nexii\\Desktop\\abc4.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("C:\\Users\\nexii\\Desktop\\abc4.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Carona d2 = (Carona) ois.readObject();
		System.out.println(d2.i + "   " + d2.j + " " + d2.s);

	}
}
