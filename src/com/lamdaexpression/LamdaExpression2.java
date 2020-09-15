package com.lamdaexpression;

@FunctionalInterface
interface interfw{
	public void m1();
	public static void m2() {
		System.out.println("fghfh");
	}
}
public class LamdaExpression2 implements interfw{

	public static void main(String[] args) {
		
		interfw i=() -> System.out.println("surysfsf");;
		//(i)->i*i;
		i.m1();
		interfw.m2();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
