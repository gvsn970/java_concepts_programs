package com.interview;

public class FuijiInterview {

	public static void main(String[] args) {
		String str = "aaa";
		System.out.println("The length of the largest subsequence that" + " repeats itself is : "
				+ findLongestRepeatingSubSeq(str));
	}

	 static int findLongestRepeatingSubSeq(String str)
	    {
	        int n = str.length();
	       
	  
	        // Create and initialize DP table
	        int[][] dp = new int[n+1][n+1];
	  
	        // Fill dp table (similar to LCS loops)
	        for (int i=0; i<=n-1; i++)
	        {
	            for (int j=0; j<=n-1; j++)
	            {
	            	System.out.println("str.charAt(i-1) ::"+str.charAt(i-1));
	            	System.out.println("str.charAt(j-1) ::"+str.charAt(j-1));
	            	System.out.println("i j ::"+ i +"  "+j);
	                // If characters match and indexes are not same
	                if (str.charAt(i) == str.charAt(j) && i!=j)
	                    dp[i][j] =  1 + dp[i-1][j-1];         
	                       
	                // If characters do not match
	                else
	                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
	            }
	        }
	        return dp[n][n];
	    }
}
