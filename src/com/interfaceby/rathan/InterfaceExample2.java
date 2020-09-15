package com.interfaceby.rathan;


class p{
	p() {
		System.out.println(this.hashCode());
	}
}
class c extends p{
	c() {
		System.out.println(this.hashCode());
	}
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		c c=new c();
		System.out.println(c.hashCode());
	}
}
