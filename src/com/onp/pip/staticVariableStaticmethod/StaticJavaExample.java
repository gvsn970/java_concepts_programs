package com.onp.pip.staticVariableStaticmethod;

public class StaticJavaExample {
	
	   //Static integer variable
	   static int var1=77; 
	   //non-static string variable
	   String var2;

	  static int i = 100;
	  static String s = "Beginnersbook";
	  //Static method
	  static void display()
	  {
	     System.out.println("i:"+i);
	     System.out.println("i:"+s);
	  }

	  //non-static method
	  void funcn()
	  {
	      //Static method called in non-static method
	      display();
	  }
	  //static method
	  public static void main(String args[])
	  {
		  //Static variables are shared among all the instances of class
		  
		  StaticJavaExample ob1 = new StaticJavaExample();
		  StaticJavaExample ob2 = new StaticJavaExample();
			/* static variables can be accessed directly without
			 * any instances. Just to demonstrate that static variables
			 * are shared, I am accessing them using objects so that 
			 * we can check that the changes made to static variables
			 * by one object, reflects when we access them using other
			 * objects
			 */
		        //Assigning the value to static variable using object ob1
			StaticJavaExample.var1=88;
			ob1.var2="I'm Object1";
		        /* This will overwrite the value of var1 because var1 has a single 
		         * copy shared among both the objects.
		         */
		        StaticJavaExample.var1=99;
			ob2.var2="I'm Object2";
			System.out.println("ob1 integer:"+StaticJavaExample.var1);
			System.out.println("ob1 String:"+ob1.var2);
			System.out.println("ob2 integer:"+StaticJavaExample.var1);
			System.out.println("ob2 STring:"+ob2.var2);
			
		//Static method accessed directly in static and non-static method
		  
		  StaticJavaExample obj = new StaticJavaExample();
		  //You need to have object to call this non-static method
		  obj.funcn();
		  
	      //Static method called in another static method
	      display();
	   }
	}