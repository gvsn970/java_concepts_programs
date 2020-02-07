package com.ebolrank;

public class StringReve {

	public static void main(String[] args) {
		  String A="madam";
	        String temp="";
	        char[] a=A.toCharArray();
	        for(int i=a.length-1;i>=0;i--){
	            temp+=A.charAt(i);
	        }
	        System.out.println(temp);
	        if(temp.equals(A)) {
	        	System.out.println("YES");
	        }else {
	        	System.out.println("NO");
	        }
	        
	}
}
