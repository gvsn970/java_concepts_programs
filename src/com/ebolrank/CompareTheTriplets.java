package com.ebolrank;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(3);
		a.add(123);
		List<Integer> b = new ArrayList<Integer>();
		b.add(32);
		b.add(31);
		b.add(12);
		int aliceCount=0,bobCount=0;
		for (int i = 0; i < a.size(); i++) {
			
				if(a.get(i) > b.get(i)) {
					aliceCount++;
				}else if(a.get(i) < b.get(i)){
					bobCount++;
				}else {
					
				}
			
		}
		System.out.println(aliceCount+" "+bobCount);
		List<Integer> c=new ArrayList<Integer>();
		c.add(aliceCount);
		c.add(bobCount);
	}
}
