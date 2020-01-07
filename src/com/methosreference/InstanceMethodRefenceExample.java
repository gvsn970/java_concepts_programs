package com.methosreference;

class Test1{
	public int  m1(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
}
interface interf1{
	void m1(int a,int b);
}
public class InstanceMethodRefenceExample {

	public static void main(String[] args) {
		Test1 t=new Test1();
		interf1 i=t :: m1;
		i.m1(10,20);
	}
}
