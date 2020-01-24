package com.ebolrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
	List<ArrayList<Integer>> aList=new ArrayList<ArrayList<Integer>>();
	
	 ArrayList<Integer> a1 = new ArrayList<Integer>(); 
     a1.add(-1); 
     a1.add(1);
     a1.add(-7);
     a1.add(-8);
     aList.add(a1); 

     ArrayList<Integer> a2 = new ArrayList<Integer>(); 
     a2.add(-10); 
     a2.add(-8);
     a2.add(-5);
     a2.add(-2);
     aList.add(a2); 
     
     ArrayList<Integer> a3 = new ArrayList<Integer>(); 
     a3.add(0); 
     a3.add(9); 
     a3.add(7); 
     a3.add(-1); 
     aList.add(a3); 
     ArrayList<Integer> a4 = new ArrayList<Integer>(); 
     a4.add(4); 
     a4.add(4); 
     a4.add(-2);
     a4.add(1);
     aList.add(a4); 
int diagonalSum=0;
int antiDiagonalSum=0;

     System.out.println(aList.size());

     for (int i = 0; i < aList.size(); i++) { 
         for (int j = 0; j < aList.get(i).size(); j++) { 
        	 System.out.print(aList.get(i).get(j) + " ");
             if( i == j) {
            	 diagonalSum=diagonalSum+aList.get(i).get(j);
             }if( i+j == aList.size()-1 ) {
            	 antiDiagonalSum=antiDiagonalSum+aList.get(i).get(j); 
             }
         } 
         System.out.println(); 
     } 
     System.out.println(diagonalSum);
     System.out.println(antiDiagonalSum);
     System.out.println();
	}
}
