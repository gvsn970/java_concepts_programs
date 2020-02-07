package com.ebolrank;

import java.util.StringTokenizer;

public class SubstringComparisons {

	public static void main(String[] args) {
		  String smallest = "";
	        String largest = "";
		
	        String s = "welcometojava";
	        int k = 3;
	        
	        
	        	/*SortedSet<String> s1=new TreeSet<String>();
	        	for(int i=0;i<s.length()-k;i++) {
	        		s1.add(s.substring(i,i+k));
	        	}*/
	        	char a[]=s.toCharArray();
	        	char a1[]=new char [a.length];
	        	for(int i=0;i<a.length-k;i++) {
	        		a1[i]=a[i];
	        	}
	        /*	smallest=s1.first();
	        	largest=s1.last();
	        	System.out.println(s1);*/
	        	
	        	  StringTokenizer st = new StringTokenizer("my out fsd "," ");  
	        	  System.out.println(st.countTokens());
	        	     while (st.hasMoreTokens()) {  
	        	         System.out.println(st.nextToken());  
	        	         
	        	     }	 
	}
}
