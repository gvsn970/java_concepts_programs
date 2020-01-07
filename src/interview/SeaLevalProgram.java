package interview;

import java.util.Scanner;

public class SeaLevalProgram {

	public static void main(String[] args) {

		/*
		 * double meal_cost=12.0; int tip_percent=20; int tax_percent=100; float
		 * tip=(float)meal_cost*tip_percent/100; System.out.println(tip);
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Enter  Gary's path :");
		String str = s.nextLine();
		s.close();
		int noOfvallyReached = 0;
		int count = 0;
		char[] a = new char[str.length()];
		a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {

			if (a[i] == 'U') {
				count++;
				
				System.out.println("  up : " + count);
			} else if (a[i] == 'D') {
				
				System.out.println("  down : " + count);
				if(count ==0 ) {
					noOfvallyReached++;
				}
				count--;
			}
			

		}
		System.out.println("No of vallyReached : " + noOfvallyReached);

		/*
		 * Pattern p=Pattern.compile("[UD]"); Matcher m=p.matcher("UUD"); int count=0;
		 * while(m.find()) { count++;
		 * System.out.println(m.start()+":::::::"+m.end()+":::::::::"+m.group()); }
		 * System.out.println(count);
		 */

	}

}
