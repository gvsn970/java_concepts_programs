package com.interview;

public class CalculateClockAngle {

	public static void main(String[] args) {

		double h=10,  m=32;
        if (h <0 || m < 0 || h >12 || m > 60) {
            System.out.println("Invalid Input...");
            }else {
            	  if (h == 12)
                      h = 0;
                   if (m == 60)
                 {
                  m = 0;
                  h += 1;
                  if(h>12)
                    h = h-12;
                  } 
            }
 
        int hour_angle = (int)(0.5 * (h*60 + m));
        int minute_angle = (int)(6*m);
        int angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360-angle, angle);
        System.out.println("Angle Is: "+angle);
	}
}
