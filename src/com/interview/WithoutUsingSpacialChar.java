
package com.interview;

public class WithoutUsingSpacialChar {

	public static void main(String[] args) {
				
	
		int dividend=15,divisor=5;
        int sign = ((dividend < 0) ^  (divisor < 0)) ? -1 : 1; 
      
        dividend = Math.abs(dividend); 
        divisor = Math.abs(divisor); 
      
        int quotient = 0; 
          
        while (dividend >= divisor) 
        { 
            dividend -= divisor; 
            ++quotient; 
        } 
      
        int result=sign * quotient; 
        System.out.println(result);
	}

}
