package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySorting {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub int
		 * a[]={3,56,5,54,32,32,3,5,2,6,56,54,32}; int length=a.length; int count=0;
		 * for(int i=0;i<length;i++){ for(int j=i+1;j<length;j++){ if(a[i]>a[j]) { int
		 * temp=a[i]; a[i]=a[j]; a[j]=temp; } if(a[i]==a[j]){ a[j]=a[length-1];
		 * length--; j--; count++; } } System.out.println(a[i]+"---->"+count); count=0;
		 * }
		 */
		/*
		 * String answerElemets="D,C"; Collections.sort(Arrays.asList(answerElemets));
		 * System.err.println("answerElemets Sorting :"+answerElemets);
		 * 
		 */

		/*
		 * Collections.sort method is sorting the elements of ArrayList in ascending
		 * order.
		 */
		String s[] = { "D", "A", "F" };
		// String s="D,A";

		List<String> al = new ArrayList<String>();
		al = Arrays.asList(s);
		Collections.sort(al);
	//	Collections.sort(Arrays.asList(s));
		System.out.println("List after the use of" + " Collection.sort() :\n" + al);
		String finalArr[]=new String[al.size()];
		 for (int j = 0; j < al.size(); j++) { 
			  
			 finalArr[j] = al.get(j); 
	        } 
	  
		
	}

}
