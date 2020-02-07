package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	String userName = "surya";
	transient String pwd = "Nexii@123";
	transient int  pin = 123434567;

	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String rpwd = "123" + pwd;
		int epin=4444+pin;
		os.writeObject(rpwd);
		os.writeObject(epin);
	}

	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
		int epin=(int)is.readObject();
		pin=epin-444;
		
	}
}

public class CustomizedSerializationExample1 {

	public static void main(String[] args) throws Exception {

		Account d1 = new Account();
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\nexii\\Desktop\\abc3.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);

			FileInputStream fis = new FileInputStream("C:\\Users\\nexii\\Desktop\\abc3.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Account d2 = (Account) ois.readObject();

			System.out.println(d2.userName + "   " + d2.pwd+" "+d2.pin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
