package com.abstractt;

public class TestExample {

	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'd', 'A', 'B', 'C', 'D', 'a', 'b', 'c', 'd', 'D', 'E', 'F' };
		int length = ch.length;
		int count = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			for (int k = i + 1; k < length; k++) {
				if (ch[i] == ch[k]) {
					ch[k] = ch[length - 1];
					length--;
				}
			}
			System.out.println(ch[i] +"   "+count);
			count=0;
		}
		//SELECT max(Salary) From EMp WHERE Salary <(SELECT max(Salary) From EMp  Salary);
	}
}
