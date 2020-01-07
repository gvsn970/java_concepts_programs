package com.lamdaexpression;

interface interf{
	public void m1(int a,int b);
}
public class LamdaExpression1 {

	public static void main(String[] args) {
		interf i=(a,b)->System.out.println(a+b);;
		i.m1(2, 4);
		
	}
}
