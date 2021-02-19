package com.onp.pip.encapsulation;

 class Encapsulation {
	private int empSSN;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN(){
        return empSSN;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
    	empSSN = newValue;
    }

 }
 
public class TestEncapsulation 
{	 
	public static void main (String[] args) 
	{ 
		Encapsulation obj = new Encapsulation(); 
		
		// setting values of the variables 
		obj.setEmpName("Harsh"); 
		obj.setEmpAge(19); 
		obj.setEmpSSN(112233); 
		
		// Displaying values of the variables 
		System.out.println("Employee's name: " + obj.getEmpName()); 
		System.out.println("Employee's age: " + obj.getEmpAge()); 
		System.out.println("Employee's SSN: " + obj.getEmpSSN()); 
		
		// Direct access of empRoll is not possible 
		// due to encapsulation 
		// System.out.println("Employee's SSN: " + obj.getEmpName);		 
	} 
} 

